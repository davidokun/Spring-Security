package com.darsideofthedev.authorizationserver;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableResourceServer
@RestController
public class AuthorizationServerApplication {

	private static final Log logger = LogFactory.getLog(AuthorizationServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServerApplication.class, args);
	}

	@GetMapping("/user")
	public Principal user(Principal user) {

		logger.info("AS /user has been called");
		logger.debug("user info: " + user.toString());
		return user;
	}
}
