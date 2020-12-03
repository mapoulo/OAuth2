package com.AutorizationServer.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@RequestMapping("/rest/welcome")
	public String welcome() {
		return "Hello there and welcome";
	}

}
