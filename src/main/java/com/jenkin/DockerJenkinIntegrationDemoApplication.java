package com.jenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinIntegrationDemoApplication {

    @GetMapping("/welcome")
    public String dockerIntegration(){
        return "Welcome To The Docker Jenkins Integration Session !!";
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerJenkinIntegrationDemoApplication.class, args);
    }

}
