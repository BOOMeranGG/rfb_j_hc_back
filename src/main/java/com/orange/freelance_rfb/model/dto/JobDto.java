package com.orange.freelance_rfb.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class JobDto {
    private String login;
    private Long jobId;
}
