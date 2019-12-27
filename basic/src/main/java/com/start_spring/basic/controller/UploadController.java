package com.start_spring.basic.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class UploadController {


	@GetMapping("/upload1")
	public String upload1() {
		return "upload1";
	}

	@PostMapping("/upload1")
	@ResponseBody
	public String upload1Post(MultipartHttpServletRequest mRequest) {
		String result = "";
		
		
		List<MultipartFile> mFiles = mRequest.getFiles("file");
		for(int i = 0; i <mFiles.size(); i++) {
			
			MultipartFile mFile = mFiles.get(i);
			String oName = mFile.getOriginalFilename();
			result += oName + "\n";
			
			try {
				mFile.transferTo(new File("c:/dev/" + oName));
			
			} catch (IllegalStateException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		}
				
				
			
		return result;
	}
}