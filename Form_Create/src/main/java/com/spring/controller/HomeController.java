package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "index";
	}

	@RequestMapping(path = "/form")
	public String form() {

		return "form";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String process(@RequestParam("userName") String userName, @RequestParam("email") String email,
			@RequestParam("password") String password, Model model) {

		model.addAttribute("userName", userName);
		model.addAttribute("password", password);
		model.addAttribute("email", email);
		return "process";
	}
}
