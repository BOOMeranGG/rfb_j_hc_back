package com.orange.freelance_rfb.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FeedbackDto {
    private String review;
    private Integer rating;
    private String login;
}
