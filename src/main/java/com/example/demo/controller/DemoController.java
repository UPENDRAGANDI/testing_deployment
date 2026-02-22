package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/get/msg")
    public ResponseEntity<String> sendMsg()
    {
        return new ResponseEntity<String>("Hello successfully deployed", HttpStatus.OK);
    }

    @GetMapping("/get/msg1")
    public ResponseEntity<String> sendMsg1()
    {
        return new ResponseEntity<String>("Hello Upendra", HttpStatus.OK);
    }
}
