package ecommerceapp.com.controller;


// <artifactId>spring-boot-starter-web</artifactId>
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testmessage {
	
	@GetMapping(value = "/showmessage")
	String Message() {
		return "hi how are you";
	}

}
