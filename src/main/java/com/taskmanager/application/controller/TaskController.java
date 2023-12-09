package com.taskmanager.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/task")
public class TaskController {
    @GetMapping
    public ResponseEntity<String> findById() {
        return ResponseEntity.ok("ok");
    }
}
