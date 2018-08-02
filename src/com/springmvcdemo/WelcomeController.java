package com.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String newUser(Model model) {
		model.addAttribute("user", new User());
		return "userForm";
	}

	@RequestMapping(value = "/addUser", method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user) {
		return "showUser";
	}
}