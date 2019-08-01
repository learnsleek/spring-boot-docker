package com.learnsleek.app.com.learnsleek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HomeController {
    @GetMapping(path="/", produces = "application/json")
    public String getHome()
    {

        return "Hello World!";
    }
}
