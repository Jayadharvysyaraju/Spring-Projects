package com.springmvc4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="/greeting")
	public String sayHello(Model model) {
		model.addAttribute("greeting", "Hello Jay");
		return "hello";
	}
	
	@RequestMapping(value="/index")
	public String index(Model model) {
		return "forward:index.jsp";
	}
}
