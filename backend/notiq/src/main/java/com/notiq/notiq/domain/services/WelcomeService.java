package com.notiq.notiq.domain.services;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String execute() {
        return "Welcome to notiq API!";
    }
}
