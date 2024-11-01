package com.rishky.microservices.order.repository;

import com.rishky.microservices.order.modal.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {


}
