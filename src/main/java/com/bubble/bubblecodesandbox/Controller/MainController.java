package com.bubble.bubblecodesandbox.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {
    @GetMapping("/health")
    public String healthCheck(){
        return "ok";
    }
}
