package com.dciwang.respons;

import com.dciwang.common.api.ResultCode;

/**
 * default status code = "20000"
 */
public class BaseResponse {

  /**
   * status code default 20000
   */
  private final String statusCode;
  /**
   * status message default ""
   */
  private String statusMsg;

  public BaseResponse() {
    this(ResultCode.RESPONSE_STATUS_CODE_SUCCESS.toString());
  }

  public BaseResponse(String statusCode) {
    this(statusCode, "");
  }

  public BaseResponse(String statusCode, String statusMsg) {
    this.statusCode = statusCode;
    this.statusMsg = statusMsg;
  }

  public String getStatusCode() {
    return statusCode;
  }

  public String getStatusMsg() {
    return statusMsg;
  }

  public void setStatusMsg(String statusMsg) {
    this.statusMsg = statusMsg;
  }

}
