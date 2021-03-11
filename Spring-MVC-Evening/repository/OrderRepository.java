package com.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.springmvc.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
