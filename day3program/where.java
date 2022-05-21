package ecommerceapp5.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// <artifactId>spring-boot-starter-web</artifactId>
@RestController
public class where {
	// GET Method
	@GetMapping(value="/showmessage")
	String Message() {
		return "where are you";
	}

}
