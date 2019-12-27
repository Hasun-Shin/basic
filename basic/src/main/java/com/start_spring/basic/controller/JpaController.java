package com.start_spring.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.start_spring.basic.model.Product;
import com.start_spring.basic.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class JpaController {
	@Autowired
	ProductRepository productRepository;

//	@GetMapping("/jpa/product2")
//	public Product product2(String name) {
//		//Product list = productRepository.findByName(name); //findAll() 모든 걸 찾고 list 형태로 return 한다. 
//		Product list = null;
//		try {
//			list = productRepository.findByName(name);
//		} catch (Exception e) {
//			list = new Product();
//			list.setName("오류!");
//		}
//		
//		
//		
//		return list;
//	}
	
	@GetMapping("/jpa/product")
	public List<Product> product() {
		List<Product> list = productRepository.findAll(); //findAll() 모든 걸 찾고 list 형태로 return 한다. 
		return list;
	}
	
	@GetMapping("/jpa/product2")
	public Product product(String name) {
		Product list = productRepository.findByName(name); //findAll() 모든 걸 찾고 list 형태로 return 한다. 
		return list;
	}

	
	
	@PostMapping("/jpa/product")
	public String productPost(@ModelAttribute Product product) {
		Product pro = productRepository.save(product); //저장된 형태를 return 한다. 
		log.error(pro.toString()); //error 는 문자열로만 처리할 수 있음. 
		return "redirect:/jpa/product";
	}
}