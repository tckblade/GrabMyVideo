package com.tck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Welcome to the GrabMyVideo WebApplication.
 */
@SpringBootApplication
public class GrabMyVideoApplication extends SpringBootServletInitializer
{
    public static void main(String[] args) {
        SpringApplication.run(GrabMyVideoApplication.class, args);
    }
}
