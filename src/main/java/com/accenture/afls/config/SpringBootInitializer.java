package com.accenture.afls.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Soumyabrata on 2/12/2018.
 */
@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class SpringBootInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootInitializer.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootInitializer.class, args);
    }
}
