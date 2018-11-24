package com.rrl.base.core;

/**
 * 服务（业务）异常如“ 账号或密码错误 ”，该异常只做INFO级别的日志记录
 * 
 * @author ml
 * @date 2018年11月6日 下午2:10:55
 *
 */
public class ServiceException extends RuntimeException {

  private static final long serialVersionUID = 3511628622754204673L;

  public ServiceException() {}

  public ServiceException(String message) {
    super(message);
  }

  public ServiceException(String message, Throwable cause) {
    super(message, cause);
  }
}
