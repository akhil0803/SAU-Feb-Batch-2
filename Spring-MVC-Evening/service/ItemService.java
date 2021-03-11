package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.model.Item;
import com.springmvc.model.OrderItem;
import com.springmvc.model.Orders;
import com.springmvc.repository.ItemRepository;
import com.springmvc.repository.OrderRepository;

@Service
public class ItemService {

	@Autowired
	ItemRepository irepo;

	public String createItem(int id, Item i) {
		irepo.save(i);
		return "Item created";
	}

}
