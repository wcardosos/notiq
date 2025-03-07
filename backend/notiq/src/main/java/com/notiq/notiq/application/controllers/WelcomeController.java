package com.notiq.notiq.application.controllers;

import com.notiq.notiq.domain.services.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @Autowired
    private final WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping
    public ResponseEntity<String> getHealthCheck() {
        String welcomeMessage = welcomeService.execute();

        return ResponseEntity.ok().body(welcomeMessage);
    }
}
