package com.darksideofthedev.springsecurityauthserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/v1/hello")
public class HelloController {

    @GetMapping("/principal")
    public Principal user(Principal principal) {

        return principal;
    }

    @GetMapping
    public String sayHello() {

        return "Hello World";
    }
}
