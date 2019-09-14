package com.orange.freelance_rfb.repository;

import com.orange.freelance_rfb.model.entity.ResponsesToOrders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponsesToOrdersRepository
    extends JpaRepository<Long, ResponsesToOrders> {
}
