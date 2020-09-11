package com.dciwang.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Messages {

  @Autowired
  private MessageSource messageSource;

  public String getMessage(String code) {
    return messageSource.getMessage(code, null, LocaleContextHolder.getLocale());
  }

  public String getMessage(String code, String... args) {
    return messageSource.getMessage(code, args, LocaleContextHolder.getLocale());
  }

  public Map<String, String> getJsonMessage(String code, String... args) {
    HashMap<String, String> errorHash = new HashMap<>();
    errorHash.put("code", code);
    errorHash.put("message", getMessage(code, args));
    return errorHash;
  }

}
