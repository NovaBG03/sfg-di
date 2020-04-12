package com.example.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("BG")
@Service("i18nGreetingService")
public class I18nBulgarianGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Здравей Свят! - БГ";
    }
}
