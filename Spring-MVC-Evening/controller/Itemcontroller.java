package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.model.Item;
import com.springmvc.repository.ItemRepository;
import com.springmvc.service.ItemService;

@RestController
public class Itemcontroller {

	@Autowired
	ItemService item;

	@PostMapping("/createitem")
	public String createItem(@RequestParam("id") int id, @RequestBody Item i) {
		return item.createItem(id, i);
	}

}
