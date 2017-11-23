package com.darksideofthedev.resourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

@SpringBootApplication
@RestController
@EnableResourceServer
public class ResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceServerApplication.class, args);
	}

	private String message = "Hello World!";

	@GetMapping("/")
	public Map<String, String> home() {

		return Collections.singletonMap("message", message);
	}

	@PostMapping("/")
	public void updateMessage(@RequestBody String message) {

		this.message = message;
	}

	@GetMapping("/user")
	public Map<String, String> user(Principal user) {

		return Collections.singletonMap("message", "user is: " + user.toString());
	}
}
