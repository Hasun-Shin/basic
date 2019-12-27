package com.start_spring.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController2 {
	@GetMapping("/getggoreb")
	public String kakao() {
		return "map";
	}

}
