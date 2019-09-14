package com.orange.freelance_rfb.api.controller;

import com.orange.freelance_rfb.model.dto.FullAccountDto;
import com.orange.freelance_rfb.model.dto.LoginDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class AccountController {

    @ResponseStatus(HttpStatus.CONFLICT)
    void print() {
        System.out.println(1);
    }

    @RequestMapping("/login")
    public void login(@RequestBody LoginDto login, HttpServletResponse response) {
        //TODO
        if (login.getLogin().equals("login")) {
            response.setStatus(200);
            return;
        }
        response.setStatus(400);
    }

    @RequestMapping("/registration")
    public void registration(@RequestBody LoginDto login) {
        //TODO
    }

    @RequestMapping("/money")
    public String moneyCheck(@RequestBody LoginDto login) {
        //TODO
        int money = 0;
        return "{\"money\":\"" + money + "\"}";
    }

    @GetMapping("/account")
    public FullAccountDto account(@RequestParam(value = "login") String login) {
        //TODO
        System.out.println(login);
        return FullAccountDto.builder().build();
    }
}
