package com.project.FlightSearch.controller;

import com.project.FlightSearch.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody String userName, @RequestBody String password) {
        String token = loginService.login(userName,password);
        return ResponseEntity.ok(token);
    }
}
