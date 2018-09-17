package com.optimusprime.diwithspring.config;

import com.optimusprime.diwithspring.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${optimus.username}")
    String userName;

    @Value("${optimus.password}")
    String password;

    @Value("${optimus.url}")
    String url;


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource= new FakeDataSource();
        fakeDataSource.setUser(this.userName);
        fakeDataSource.setPassword(this.password);
        fakeDataSource.setUrl(this.url);

        return  fakeDataSource;


    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
