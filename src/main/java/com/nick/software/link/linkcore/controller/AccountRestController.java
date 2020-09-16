package com.nick.software.link.linkcore.controller;

import com.nick.software.link.linkcore.dto.RegistrationDTO;
import com.nick.software.link.linkcore.service.AccountServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class AccountRestController {
    private AccountServiceImp accountServiceImp;

    @Autowired
    public AccountRestController(AccountServiceImp accountServiceImp) {
        this.accountServiceImp = accountServiceImp;
    }

    @PostMapping("register")
    public ResponseEntity<Void> registerUser(@RequestBody RegistrationDTO registrationDTO) {
        accountServiceImp.registerAccount(registrationDTO);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}

