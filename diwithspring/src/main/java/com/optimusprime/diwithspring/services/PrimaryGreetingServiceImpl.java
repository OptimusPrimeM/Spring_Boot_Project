package com.optimusprime.diwithspring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("en")
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the primary greeting service.";
    }
}