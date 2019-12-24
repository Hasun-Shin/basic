package com.start_spring.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller

public class LoginController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@PostMapping("/login") //�엯�젰�맂 �젙蹂대�� (�븘�씠�뵒,�뙣�뒪�썙�뱶) �꽌踰꾩뿉 �쟾�떖�븯湲� �쐞�빐 post 
	@ResponseBody
	
	public String loginPost(
			@RequestParam("id") String id,
			@RequestParam("pw") String pw) {
		
		String dbId = "boot";
		String dbPw = "1234";

		if(dbId.equals(id) && dbPw.equals(pw)) {
			return "濡쒓렇�씤 �꽦怨�";
			
		}
		
		return "濡쒓렇�씤 �떎�뙣";
	}

}
