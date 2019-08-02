package com.learnsleek.app.com.learnsleek.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping(path="/", produces = "application/json")
    public String getHome()
    {
        logger.debug("Called Hello World !!");
        return "Hello World!";
    }
}
