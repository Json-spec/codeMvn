package com.webServer.project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.webServer.project")
public class WebServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebServerApplication.class, args);
    }
}
