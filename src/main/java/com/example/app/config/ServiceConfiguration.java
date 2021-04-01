package com.example.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {
        "com.example.app.service",
        "com.example.app.repository"})
public class ServiceConfiguration {
}


