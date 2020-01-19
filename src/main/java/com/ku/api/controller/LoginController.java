package com.ku.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class LoginController {

	@GetMapping("/toPage")
	public String toPage() {
		return "addPage.jsp";
	}
}
