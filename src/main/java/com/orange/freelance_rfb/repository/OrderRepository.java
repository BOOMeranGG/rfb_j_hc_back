package com.orange.freelance_rfb.repository;

import com.orange.freelance_rfb.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository
    extends JpaRepository<Order, Long> {
}
