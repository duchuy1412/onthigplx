package com.onthi.gplx.auth;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/register")
    public Map<String, String> register(@Valid @RequestBody AuthRequest request) {
        return Map.of("message", "Register endpoint is ready", "email", request.email());
    }

    @PostMapping("/login")
    public Map<String, String> login(@Valid @RequestBody AuthRequest request) {
        return Map.of("accessToken", "replace-with-jwt-token", "email", request.email());
    }

    public record AuthRequest(@Email String email, @NotBlank String password) {}
}
