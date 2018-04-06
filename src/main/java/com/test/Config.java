package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by deshan on 4/6/2018.
 */

@Configuration
@ComponentScan
public class Config
{
    @Bean
    public Address address()
    {
        Address address=new Address("4/39","Beligalagoda","Ambalantota");
        return address;
    }
}
