package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nBulgarianGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Здравей Свят! - БГ";
    }
}
