package com.orange.freelance_rfb.service;

import com.orange.freelance_rfb.model.dto.FeedbackDto;
import com.orange.freelance_rfb.model.dto.FullAccountDto;
import com.orange.freelance_rfb.model.entity.Account;
import com.orange.freelance_rfb.model.entity.Portfolio;
import com.orange.freelance_rfb.model.enums.AccountType;
import com.orange.freelance_rfb.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public boolean registration(String login, String password, String name, AccountType type) {
        if (accountRepository.findByLogin(login).isEmpty()) {
            Account account = Account.builder().
                    login(login).
                    password(password).
                    fullname(name).
                    account_type(type.name()).
                    build();
            accountRepository.save(account);
            return true;
        } else {
            return false;
        }
    }

    public int getMoney(String login) {
        return accountRepository.findByLogin(login).get(0).getBalance();
    }

    public FullAccountDto getAccount(String login) {
        Account account = accountRepository.findByLogin(login).get(0);
        List<String> infos = (List<String>) account.getPortfolios().stream().map(Portfolio::getInfo);
        List<FeedbackDto> feedbackList = (List<FeedbackDto>)
                account.getFeedbacks().stream().peek((f) ->
                        FeedbackDto.builder().
                                login(login).
                                review(f.getReview()).
                                rating(f.getRating()).
                                build());
        return FullAccountDto.builder().
                login(login).
                name(account.getFullname()).
                sumOfRating(account.getSumOfRatings()).
                numberOfRating(account.getNumberOfRatings()).
                portfolios(infos).
                feedbackList(feedbackList).
                build();
    }
}
