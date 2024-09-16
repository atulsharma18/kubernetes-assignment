package com.nagarro.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class KubernetesAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesAssignmentApplication.class, args);
	}
	
	@RestController
    public class HelloWorldController {

        @GetMapping("/hello")
        public String hello() {
            return "Hello, World!";
        }
    }
	
	@RestController
	public class HealthController {

	    @GetMapping("/health")
	    public ResponseEntity<String> healthCheck() {
	        return ResponseEntity.ok("Application is healthy");
	    }
	}
}
