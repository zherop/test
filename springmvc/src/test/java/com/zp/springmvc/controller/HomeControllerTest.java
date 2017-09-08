package com.zp.springmvc.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author 曾鹏
 * @mail zp@zving.com
 * @date 2017年8月30日
 */
public class HomeControllerTest {
	@Test
	public void home() throws Exception {
		HomeController homeController = new HomeController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
		mockMvc.perform(get("/")).andExpect(view().name("home"));
	}

	@Test
	public void processRegister() {
		// UserRepository userRepository = new UserDefaultRepository();
		// UserController userController = new UserController(userRepository);
	}
}
