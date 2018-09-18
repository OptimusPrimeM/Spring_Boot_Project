package com.optimusprime.diwithspring.config;

import com.optimusprime.diwithspring.examplebeans.FakeDataSource;
import com.optimusprime.diwithspring.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${optimus.username}")
    String userName;

    @Value("${optimus.password}")
    String password;

    @Value("${optimus.url}")
    String url;

    @Value("${optimus.jms.username}")
    String jmsUserName;

    @Value("${optimus.jms.password}")
    String jmsPassword;

    @Value("${optimus.jms.url}")
    String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource= new FakeDataSource();
        fakeDataSource.setUser(environment.getProperty("USERNAME"));
        fakeDataSource.setPassword(this.password);
        fakeDataSource.setUrl(this.url);

        return  fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
       FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
       fakeJmsBroker.setUser(this.jmsUserName);
        fakeJmsBroker.setPassword(this.jmsPassword);
        fakeJmsBroker.setUrl(this.jmsUrl);

        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
