package com.orange.freelance_rfb.repository;

import com.orange.freelance_rfb.model.entity.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository
    extends JpaRepository<Portfolio, Long> {
}
