package com.bank.bootcoin.infraestructure.spring.config;

import com.bank.bootcoin.application.model.BootcoinRepository;
import com.bank.bootcoin.infraestructure.repository.BootcoinCrudRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public BootcoinRepository repository() {
        return new BootcoinCrudRepository();
    }

}
