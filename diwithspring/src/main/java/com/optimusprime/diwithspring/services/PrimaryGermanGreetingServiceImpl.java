package com.optimusprime.diwithspring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("ge")
public class PrimaryGermanGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "This is german primary active service";
    }
}
