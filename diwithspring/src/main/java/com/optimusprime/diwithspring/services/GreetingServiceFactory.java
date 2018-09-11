package com.optimusprime.diwithspring.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService creatingGreetingService(String lang){

        switch (lang){
            case "en":
                return new PrimaryGreetingServiceImpl(greetingRepository);
            case "ge":
                return new PrimaryGermanGreetingServiceImpl(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingServiceImpl(greetingRepository);
            default:
                return new PrimaryGreetingServiceImpl(greetingRepository);
        }


    }

}
