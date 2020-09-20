package com.zzl.english.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/word")
public class EnglishWordController {
	
	
	@GetMapping("/test")
	public String findWord() {
		return "test word";
	}
}
