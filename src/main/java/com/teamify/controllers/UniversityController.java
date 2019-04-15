package com.teamify.controllers;

import com.teamify.entities.University;
import com.teamify.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/university")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping(path = "/all")
    public List<University> getAllUniversities() {
        return  universityService.getAllUniversities();
    }
}
