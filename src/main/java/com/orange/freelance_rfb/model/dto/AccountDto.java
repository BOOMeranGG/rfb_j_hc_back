package com.orange.freelance_rfb.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AccountDto {
    private String login;
    private String name;
    private Integer sumOfRatings;
    private Integer numberOfRatings;
}
