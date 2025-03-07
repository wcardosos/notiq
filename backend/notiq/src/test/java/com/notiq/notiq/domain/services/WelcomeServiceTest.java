package com.notiq.notiq.domain.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WelcomeServiceTest {

    private final WelcomeService sut = new WelcomeService();

    @Test
    void shouldReturnWelcomeMessage() {
        String result = sut.execute();

        assertEquals("Welcome to notiq API!", result);
    }
}
