package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.model.OrderItem;
import com.springmvc.model.Orders;
import com.springmvc.repository.ItemRepository;
import com.springmvc.repository.OrderItemRepository;
import com.springmvc.repository.OrderRepository;

@Service
public class OrderItemService {
	@Autowired
	OrderRepository orepo;

	@Autowired
	ItemRepository irepo;

	@Autowired
	OrderItemRepository oirepo;

	public List<OrderItem> getItems(int id) {
		return orepo.getOne(id).getItems();
	}

	public String addItem(int id, OrderItem i) {
		oirepo.save(i);
		Orders o = orepo.getOne(id);
		o.getItems().add(i);
		System.out.println(o);
		orepo.save(o);
		return "OrderItem created and added to order";
	}

	public String deleteItem(int id) {
		oirepo.deleteById(id);
		return "deleted";
	}

	public String updateItem(int id, int orderid, OrderItem i) {
		deleteItem(orderid);
		addItem(id, i);
		return "updated successfully";
	}

}
