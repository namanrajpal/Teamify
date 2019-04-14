package com.teamify.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfiguration {

    @Bean
    public MockDataLoader mockDataLoader()
    {
        return new MockDataLoader();
    }
}
