package com.dciwang.respons;

import com.dciwang.common.api.CommonResult;
import com.dciwang.common.api.ResultCode;
import com.dciwang.domain.SpringContext;
import com.dciwang.message.Messages;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class MessageResponse extends CommonResult {

  @Getter
  private final List<MessageEx> messageList = new ArrayList<>();

  @Getter
  private String type;

  @Setter
  @Getter
  private boolean custom;

  @Setter
  @Getter
  private Object value;

  @JsonIgnore
  private final Messages messages;

  private MessageResponse() {
    super(ResultCode.RESPONSE_STATUS_CODE_FAILED_BIZ.toString());
    messages = SpringContext.getBean(Messages.class);
    custom = false;
  }

  public static MessageResponse newInstance() {
    return new MessageResponse();
  }

  public static MessageResponse newInstance(String messageId, String... args) {
    MessageResponse messageResponse = new MessageResponse();
    messageResponse.addMessageId(messageId, args);
    return messageResponse;
  }

  public MessageResponse addMessageId(String messageId, String... args) {
    addMessageInner(String.valueOf(messageId.charAt(0)), messageId, messages
        .getMessage(messageId, args));
    updateType();
    return this;
  }

  public MessageResponse addMessage(String message, Object... args) {
    String msg = message;
    if (args != null) {
      for (int i = 0; i < args.length; i++) {
        msg = msg.replaceAll("\\{" + i + "}", String.valueOf(args[i]));
      }
    }
    addMessageInner("E", "", msg);
    updateType();
    return this;
  }

  private void updateType() {
    if (messageList.stream().anyMatch(m -> "E".equals(m.getType()))) {
      type = "E";
    } else if (messageList.stream().anyMatch(m -> "W".equals(m.getType()))) {
      type = "W";
    } else {
      type = "I";
    }
  }

  public boolean hasError() {
    return !messageList.isEmpty();
  }

  protected void addMessageInner(String type, String messageId, String message) {
    messageList.add(new MessageEx(type, messageId, message));
  }

  @Data
  public static class MessageEx {
    private String type;
    private String messageId;
    private String message;

    public MessageEx() {
    }

    public MessageEx(String type, String messageId, String message) {
      this.type = type;
      this.messageId = messageId;
      this.message = message;
    }
  }
}

