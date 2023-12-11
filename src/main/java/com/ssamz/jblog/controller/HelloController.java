package com.ssamz.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/html")
	public String html() {
		System.out.println("Request HTML");
		return "redirect:hello.html";
	}
	
	@GetMapping("/image")
	public String image() {
		System.out.println("Request Image");
		return "redirect:image/solsol.jpg";
	}

}
