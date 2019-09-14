package com.orange.freelance_rfb.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class FullAccountDto {
    private String login;
    private String name;
    private Double rating;
    private List<FeedbackDto> feedbackList;
    private List<PortfoliosDto> portfolioList;
}
