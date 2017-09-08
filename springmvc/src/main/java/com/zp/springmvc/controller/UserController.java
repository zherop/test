package com.zp.springmvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.zp.springmvc.dao.UserRepository;
import com.zp.springmvc.exception.UserNotFoundException;
import com.zp.springmvc.model.User;

/**
 * @author 曾鹏
 * @mail zp@zving.com
 * @date 2017年8月30日
 */
@Controller
public class UserController {
	private UserRepository userRepository;

	private static final String RESOURCE_BASE_PATH = "E:/workspace/springmvc/src/main/webapp/WEB-INF/";

	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping(path = "/userList", method = RequestMethod.GET)
	public String list(Model model) {
		List<User> users = userRepository.findUsers();
		model.addAttribute("users", users);
		return "userList";
	}

	@RequestMapping(path = "/user/{name}", method = RequestMethod.GET)
	public String userInfo(@PathVariable("name") String name, Model model) {
		if (!model.containsAttribute("user")) {
			User user = userRepository.findOne(name);
			if (user == null) {
				throw new UserNotFoundException();
			}
			model.addAttribute("user", user);
		}
		return "userInfo";
	}

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String register() {
		return "registerForm";
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String processRegister(RedirectAttributes model, @RequestPart("headPicture") MultipartFile headPicture, @Valid User user,
			Errors errors) {
		if (errors.hasErrors()) {
			model.addAttribute("Errors", errors.getAllErrors());
			return "registerForm";
		}
		String savePicture = savePicture(headPicture);
		user.setHeadPicture(savePicture);
		userRepository.save(user);
		model.addAttribute("name", user.getName());
		model.addFlashAttribute("user", user);
		return "redirect:/user/{name}";
	}

	/**
	 * @param headPicture
	 */
	private String savePicture(MultipartFile headPicture) {
		try {
			final String fileName = RESOURCE_BASE_PATH + "head/" + headPicture.getOriginalFilename();
			headPicture.transferTo(new File(fileName));
			return fileName;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
