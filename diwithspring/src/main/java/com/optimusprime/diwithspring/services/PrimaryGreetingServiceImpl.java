package com.optimusprime.diwithspring.services;

//@Service
//@Primary
//@Profile({"en","default"})
public class PrimaryGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
