package com.optimusprime.diwithspring.services;

//@Service
//@Primary
//@Profile("es")
public class PrimarySpanishGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
