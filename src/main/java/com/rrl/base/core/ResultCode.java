package com.rrl.base.core;

/**
 * 响应码枚举
 */
public enum ResultCode {
    SUCCESS(200, "成功"),
    FAIL(400, "失败"),
    UNAUTHORIZED(401, "未认证（签名错误）"),
    NOT_FOUND(404, "接口不存在"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误");

  private Integer code;
  private String msg;
  
  ResultCode(Integer code, String msg){
      this.code = code;
      this.msg = msg;
  }
  
  public Integer getCode() {
      return code;
  }
  public void setCode(Integer code) {
      this.code = code;
  }
  public String getMsg() {
      return msg;
  }
  public void setMsg(String msg) {
      this.msg = msg;
  }
}
