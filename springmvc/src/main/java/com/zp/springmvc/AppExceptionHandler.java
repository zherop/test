package com.zp.springmvc;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zp.springmvc.exception.UserNotFoundException;

/**
 * @author 曾鹏
 * @mail zp@zving.com
 * @date 2017年8月31日
 */
@ControllerAdvice
public class AppExceptionHandler {
	/**
	 * 异常处理
	 * 
	 * @return
	 */
	@ExceptionHandler(UserNotFoundException.class)
	public String handleUserNotFoundException() {
		return "userError";
	}
}
