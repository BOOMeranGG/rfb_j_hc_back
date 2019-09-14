package com.orange.freelance_rfb.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class PortfoliosDto {
    private List<String> infos;
}
