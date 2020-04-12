package com.example.sfgdi.services;

public class GreetingServiceFactory {
    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService crateGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new I18nEnglishGreetingService();
            case "bg":
                return new I18nBulgarianGreetingService();
            default:
                return new PrimaryGreetingService();
        }
    }
}
