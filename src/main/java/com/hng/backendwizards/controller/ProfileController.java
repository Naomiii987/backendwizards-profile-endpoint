package com.hng.backendwizards.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/me")
public class ProfileController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping
    public ResponseEntity<Map<String, Object>> getProfile() {
        Map<String, Object> response = new HashMap<>();

        response.put("status", "success");

        Map<String, Object> user = new HashMap<>();
        user.put("email", "mondoangela@gmail.com");
        user.put("name", "Angela Mondo");
        user.put("stack", "Java");
        response.put("user", user);

        response.put("timestamp", Instant.now().toString());

        String fact;
        try {
            Map catFactResponse = restTemplate.getForObject("https://catfact.ninja/fact", Map.class);
            fact = (String) catFactResponse.get("fact");
        } catch (Exception e) {
            fact = "Could not fetch cat fact right now. Try again later.";
        }
        response.put("fact", fact);

        return ResponseEntity.ok(response);
    }
}

