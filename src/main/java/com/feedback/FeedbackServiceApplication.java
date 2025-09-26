package com.feedback;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(exclude= {UserDetailsServiceAutoConfiguration.class})
@Log4j2
@EnableAsync
@OpenAPIDefinition(info = @Info(title = "Feedback Service API", version = "0.0.1", description = "Feedback Service API Controllers"))
// URL = http://localhost:3002/swagger-ui/index.html
public class FeedbackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackServiceApplication.class, args);
        log.info("Feedback Service Started...");
	}

}
