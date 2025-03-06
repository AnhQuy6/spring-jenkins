package net.javaguides.springboot_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccontController {
    @GetMapping()
    public String hello() {
        return "Spring boot with docker 123 q333333ss";
    }
}
