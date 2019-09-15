package com.orange.freelance_rfb.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "description")
    private String description;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "sum_of_transaction")
    private int sumOfTransaction;

    @Column(name = "transaction_status")
    private String transactionStatus;

    @Column(name = "transaction_date")
    private LocalDateTime transactionDate;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToMany(mappedBy = "order")
    private Set<ResponsesToOrders> responsesToOrders;
}
