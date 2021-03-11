package com.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
