package com.orange.freelance_rfb.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResponseToOrderDto {
    private Long id;
    private String authorLogin;
    private String authorName;
    private String comment;
}
