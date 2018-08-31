package com.optimusprime.diwithspring.controllers;
import com.optimusprime.diwithspring.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;
    @Before
    public void setUp() throws Exception {
        setterInjectedController =  new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void sayHello() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_PRIME, setterInjectedController.sayHello());
    }



}