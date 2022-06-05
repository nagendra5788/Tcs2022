package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Order;
import com.demo.service.OrderService;

@RestController
public class OrderController {
	
	
	
	@Autowired
	OrderService orderservice;
	@PostMapping(value="/createorder")
	Order addOrder(@RequestBody Order ord) {
		Order Ord = orderservice.createOrder(ord);
		return Ord;
	}
	
	@GetMapping("/ping")
	public String ping() {
		return "eKart App!";
	}

}
