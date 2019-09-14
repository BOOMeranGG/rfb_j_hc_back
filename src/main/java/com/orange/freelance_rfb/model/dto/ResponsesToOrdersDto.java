package com.orange.freelance_rfb.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ResponsesToOrdersDto {
    private List<ResponseToOrderDto> responses;
    //TODO
}
