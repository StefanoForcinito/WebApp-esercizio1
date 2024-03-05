package com.develhope.demogreet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/v1/ciao")
    public String greet(@RequestParam(name = "Giuseppe")String nome,
        @RequestParam(name = "provincia") String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}
