package com.optimusprime.diwithspring;

import com.optimusprime.diwithspring.controllers.ConstructorInjectedController;
import com.optimusprime.diwithspring.controllers.MyController;
import com.optimusprime.diwithspring.controllers.PropertyInjectedController;
import com.optimusprime.diwithspring.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiwithspringApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext =  SpringApplication.run(DiwithspringApplication.class, args);
		MyController myController = (MyController) applicationContext.getBean("myController");

		myController.hello();

		System.out.println("Property based = "+applicationContext.getBean(PropertyInjectedController.class).sayHello());


		System.out.println("Setter based = "+applicationContext.getBean(SetterInjectedController.class).sayHello());

		System.out.println("Constructor based = "+applicationContext.getBean(ConstructorInjectedController.class).sayHello());

	}
}
