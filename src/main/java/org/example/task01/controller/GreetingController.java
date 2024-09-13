package org.example.task01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public ResponseEntity<String> Greeting(@RequestParam(value = "name" , defaultValue = "Erasyl") String name){
        return ResponseEntity.ok(String.format("Hello %s!", name));
    }

    @GetMapping("/status")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.ok("ok");
    }
}
