package com.lama.controlls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TodoController {
	

	@Autowired
	private ApplicationContext context;
	
	
	@GetMapping("/todo")
	public String getHome() {
		return "home";
	}
}
