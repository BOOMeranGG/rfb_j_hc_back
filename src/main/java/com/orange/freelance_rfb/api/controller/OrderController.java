package com.orange.freelance_rfb.api.controller;

import com.orange.freelance_rfb.model.dto.OrderDto;
import com.orange.freelance_rfb.model.dto.ResponsesToOrdersDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/create")
    public void create(@RequestBody OrderDto  order, HttpServletResponse response) {
        //order.orderId ignore
        //TODO
    }

    @RequestMapping("/confirm")
    public void confirm(@RequestBody OrderDto order) {
        //TODO
    }

    @RequestMapping("/responses")
    public ResponsesToOrdersDto responses(@RequestBody OrderDto order) {
        //TODO
        return ResponsesToOrdersDto.builder().build();
    }
}
