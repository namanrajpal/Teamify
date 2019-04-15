package com.teamify.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/projects")
public class ProjectController {

    @GetMapping(path = "/test")
    public String getTest()
    {
        return "Hello World";
    }
}
