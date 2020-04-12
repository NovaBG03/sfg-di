package com.example.sfgdi.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello World!";
    }

    @Override
    public String getBulgarianGreeting() {
        return "Здравей свят!";
    }

    @Override
    public String getRomanianGreeting() {
        return "Salut Lume!";
    }
}
