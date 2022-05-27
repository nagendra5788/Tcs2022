package ecommerceapp.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Textmessage {
	
	@GetMapping(value = "/showmessage" )
	String message(){
		return "hi how are you";
	}

}
