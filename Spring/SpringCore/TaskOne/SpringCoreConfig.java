package com.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.core")
@PropertySource("classpath:data.properties")
public class SpringCoreConfig {

    @Bean
    public UserService getPersonService(){
        return new PersonService();
    }

    @Bean
    public UserService getManagerService(){
        return new ManagerService();
    }
}
