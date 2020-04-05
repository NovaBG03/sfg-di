package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    private PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new PropertyInjectedController();
        this.controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(this.controller.getGreeting());
    }
}