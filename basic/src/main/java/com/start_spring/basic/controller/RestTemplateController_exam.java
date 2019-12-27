package com.start_spring.basic.controller;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController_exam {
	 @GetMapping("/getMap2")
	 public Map<String, Object> getMap() {
	 RestTemplate rt = new RestTemplate();
	 Map<String, Object> map =
	 rt.getForObject("http://ggoreb.com/m/exam.jsp", Map.class);
	 return map;
	 }
	
	
}