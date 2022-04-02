package com.example.oauth2_oidc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Oauth2OidcApplication {
	
	@GetMapping("/messages")
	public String messages() {
		return "hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(Oauth2OidcApplication.class, args);
	}

}
