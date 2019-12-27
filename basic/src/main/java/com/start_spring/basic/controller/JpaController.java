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
//		//Product list = productRepository.findByName(name); //findAll() ��� �� ã�� list ���·� return �Ѵ�. 
//		Product list = null;
//		try {
//			list = productRepository.findByName(name);
//		} catch (Exception e) {
//			list = new Product();
//			list.setName("����!");
//		}
//		
//		
//		
//		return list;
//	}
	
	@GetMapping("/jpa/product")
	public List<Product> product() {
		List<Product> list = productRepository.findAll(); //findAll() ��� �� ã�� list ���·� return �Ѵ�. 
		return list;
	}
	
	@GetMapping("/jpa/product2")
	public Product product(String name) {
		Product list = productRepository.findByName(name); //findAll() ��� �� ã�� list ���·� return �Ѵ�. 
		return list;
	}

	
	
	@PostMapping("/jpa/product")
	public String productPost(@ModelAttribute Product product) {
		Product pro = productRepository.save(product); //����� ���¸� return �Ѵ�. 
		log.error(pro.toString()); //error �� ���ڿ��θ� ó���� �� ����. 
		return "redirect:/jpa/product";
	}
}