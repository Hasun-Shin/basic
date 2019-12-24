package com.start_spring.basic.model;

import lombok.Data;

@Data //lombok 이 데이터를 저절로 만들어줌. 
public class Member {
	private String name;
	private String userId;
	private String userPassword;
	
	

	
}