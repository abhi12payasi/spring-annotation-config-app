package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.app.bean")
public class AppConfig {

    @Bean
    public List<String> taskList(){
        String [] tasks = {"DEV" , "DEPLOY" , "TEST"};
        return Arrays.asList(tasks);
    }
}
