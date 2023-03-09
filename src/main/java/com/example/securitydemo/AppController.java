package com.example.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AppController {

    @GetMapping("/")
    public Principal test(Principal principal) {
        return principal;
    }

    @GetMapping("/new/test")
    public String testApi() {
        return "working...";
    }

    @GetMapping("/filter")
    public String withoutFilter() {
        return "working...";
    }
}
