package ru.hogwartswithbd.schoolwithbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class SchoolwithbdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolwithbdApplication.class, args);
    }

}
