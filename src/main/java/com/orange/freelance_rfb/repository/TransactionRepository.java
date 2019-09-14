package com.orange.freelance_rfb.repository;

import com.orange.freelance_rfb.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository
    extends JpaRepository<Long, Transaction> {
}
