package com.zp.springmvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author 曾鹏
 * @mail zp@zving.com
 * @date 2017年8月31日
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "User Not Found")
public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
