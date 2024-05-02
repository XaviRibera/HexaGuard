package com.XaviRibera.hexaGuard.infraestructure.in.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @GetMapping("/login")
    public String logIn(@RequestParam String param) {
        return new String();
    }
    
}
