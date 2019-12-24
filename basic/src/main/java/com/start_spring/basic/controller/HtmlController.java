package com.start_spring.basic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.start_spring.basic.model.Member;

@Controller
public class HtmlController {
	@GetMapping("html/string") //templates에 직접 넣으면 안됨. 
	public String html() {
		return "html/string";
	}

	@GetMapping("html/void")
	public void htmlVoid() {
	}

	@GetMapping("html/map")
	public Map<String, Object> htmlMap(Map<String, Object> map) {
		Map<String, Object> map2 = new HashMap<String, Object>();
		return map2;
	}

	@GetMapping("html/model")
	public Model htmlModel(Model model) {
		return model;
	}

	@GetMapping("html/model_and_view")
	public ModelAndView htmlModel() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("html/model_and_view");
		return mav;
	}

	@GetMapping("html/object")
	@ResponseBody //JSON 형식으로 바꾸어줌. 
	public Member htmlObject() {
		Member member = new Member();
		member.setName("Shin");
		member.setUserId("hahaha");
		member.setUserPassword("모름");
		
		return member;
	}
}