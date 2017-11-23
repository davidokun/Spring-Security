package com.darsideofthedev.authorizationserver;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Principal;

@SpringBootApplication
public class AuthorizationServerApplication {

	private static final Log logger = LogFactory.getLog(AuthorizationServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServerApplication.class, args);
	}

	public Principal user(Principal user) {

		logger.info("AS /user has been called");
		logger.debug("user info: " + user.toString());
		return user;
	}
}
