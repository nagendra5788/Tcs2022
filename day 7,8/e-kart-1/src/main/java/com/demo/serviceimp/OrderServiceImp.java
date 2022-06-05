package com.demo.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repo.OrderRepo;
import com.demo.entity.Order;
import com.demo.service.OrderService;
@Service
public class OrderServiceImp implements OrderService {
	
	
	@Autowired
	OrderRepo orderrepos;

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		Order ord = orderrepos.save(order);
		return ord;
	}

}
