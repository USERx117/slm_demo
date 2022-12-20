package com.example.slm_demo.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")

public class SlmDemoAppController{

    //http://localhost:8080/demo/calc?number=8

    @GetMapping("/calc")
    public double calculateSquare(@RequestParam double number) {
        return number * number;
    }
}
