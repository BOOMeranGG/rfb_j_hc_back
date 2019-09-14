package com.orange.freelance_rfb.model.entity;

import com.orange.freelance_rfb.model.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "account_type")
    private String account_type;

    @Column(name = "balance")
    private int balance;

    @Column(name = "sum_of_ratings")
    private int sumOfRatings;

    @Column(name = "number_of_ratings")
    private int numberOfRatings;

    @OneToMany(mappedBy = "account")
    private Set<Order> orders;

    @OneToMany(mappedBy = "account")
    private Set<Feedback> feedbacks;

    @OneToMany(mappedBy = "account")
    private Set<Portfolio> portfolios;

}
