package com.optimusprime.diwithspring.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "I was injected by Constructor ";
    }
}
