package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.entity.User;

@Controller
public class HomeController {
	@RequestMapping("/form")
	public String form() {
		return "form";
	}

	@RequestMapping("/process")
	public String process(@ModelAttribute User user, Model model) {
		model.addAttribute(user);
		return "process";
	}
}
