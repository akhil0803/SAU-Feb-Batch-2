package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.model.Orders;
import com.springmvc.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository repo;

	public List<Orders> getOrders() {
		return repo.findAll();
	}

	public Orders createOrder(Orders o) {
		return repo.save(o);
	}

}
