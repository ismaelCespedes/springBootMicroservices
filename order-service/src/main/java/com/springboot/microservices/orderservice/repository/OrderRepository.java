package com.springboot.microservices.orderservice.repository;

import com.springboot.microservices.orderservice.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, Long> {
}
