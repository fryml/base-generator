package com.rrl.base.core;

import com.alibaba.fastjson.JSON;

/**
 * 统一API响应结果封装
 * 
 * @author maliang
 * @date 2018年11月6日 下午2:48:02
 *
 */
public class Result {
  private Integer code;
  private String message;
  private Object data;

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return JSON.toJSONString(this);
  }

  public static Result success() {
    Result res = new Result();
    res.setCode(ResultCode.SUCCESS.getCode());
    res.setMessage(ResultCode.SUCCESS.getMsg());
    res.setData(null);
    return res;
  }

  public static Result success(Object obj) {
    Result res = new Result();
    res.setCode(ResultCode.SUCCESS.getCode());
    res.setMessage(ResultCode.SUCCESS.getMsg());
    res.setData(obj);
    return res;
  }

  public static Result error() {
    Result res = new Result();
    res.setCode(ResultCode.FAIL.getCode());
    res.setMessage(ResultCode.FAIL.getMsg());
    res.setData(null);
    return res;
  }

  public static Result error(Integer errCode, String errMsg) {
    Result res = new Result();
    res.setCode(errCode);
    res.setMessage(errMsg);
    res.setData(null);
    return res;
  }
}
