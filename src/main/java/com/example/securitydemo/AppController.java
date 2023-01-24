package com.example.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AppController {

    @GetMapping("/")
    public void test(Principal principal) {
        System.out.println("redirected ................");
    }

    @GetMapping("/test")
    public String testApi() {
        return "working...";
    }
}
