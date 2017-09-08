package com.zp.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 曾鹏
 * @mail zp@zving.com
 * @date 2017年8月29日
 */
@Controller
public class HomeController {
	@RequestMapping(path = { "/", "/h" }, method = RequestMethod.GET)
	public String home() {
		return "home";
	}
}
