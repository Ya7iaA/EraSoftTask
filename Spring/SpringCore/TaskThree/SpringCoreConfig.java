package com.spring.core;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.spring.core")
@PropertySource("classpath:data.properties")
public class SpringCoreConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destMethod")
    @Scope("prototype")
    public PersonService getPersonService() {
        return new PersonService();
    }
}
