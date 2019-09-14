package com.orange.freelance_rfb.repository;

import com.orange.freelance_rfb.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository
    extends JpaRepository<Account, String> {
    List<Account> findByLogin(String login);
}
