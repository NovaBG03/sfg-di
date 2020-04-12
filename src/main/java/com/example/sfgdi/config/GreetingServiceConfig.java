package com.example.sfgdi.config;

import com.example.sfgdi.services.GreetingRepository;
import com.example.sfgdi.services.GreetingRepositoryImpl;
import com.example.sfgdi.services.GreetingService;
import com.example.sfgdi.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
    public class GreetingServiceConfig {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean("i18nGreetingService")
    @Profile({"EN", "default"})
    public GreetingService i18nEnglishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.crateGreetingService("en");
    }

    @Bean("i18nGreetingService")
    @Profile("BG")
    public GreetingService i18BulgarianGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.crateGreetingService("bg");
    }
}
