package com.start_spring.basic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	// 1. 출력속도가 빠르다 
	// 2. 파일 등을 이용하여 관리가 용이함 
	//Logger logger = LoggerFactory.getLogger(this.getClass()); 얘는 lombok 안쓸때 사용함. 
	
	 //Shift + Alt + A : 열 편집 
	@RequestMapping("/")
	public String home() { //public String 은 html 로 응답을 줌. 반면에 public map 은 JSON 으로 응답을 준다. 
		log.trace("trace!");
		log.debug("debug!"); // 개발단계에서 확인용
		log.info("info!"); // 운용 상 필요한 정보
		log.warn("warning!"); // 메모리 문제 등 경고
		log.error("error!"); // 치명적인 오류 
		          
		return "home";
	}
}
