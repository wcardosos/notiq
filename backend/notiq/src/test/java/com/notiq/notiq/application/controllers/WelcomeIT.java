package com.notiq.notiq.application.controllers;

import com.notiq.notiq.domain.services.WelcomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(WelcomeController.class)
public class WelcomeIT {

    private static final String PATH = "/api/welcome";
    @Autowired
    private MockMvc mvc;
    @MockBean
    private WelcomeService welcomeService;

    @Test
    void shouldReturnWelcomeMessage() throws Exception {
        when(welcomeService.execute()).thenReturn("Welcome message");

        mvc.perform(MockMvcRequestBuilders.get(PATH))
                .andExpect(status().isOk())
                .andExpect(content().string("Welcome message"))
                .andReturn();
    }
}
