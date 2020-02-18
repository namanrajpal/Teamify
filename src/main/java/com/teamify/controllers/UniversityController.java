package com.teamify.controllers;

import com.teamify.entities.University;
import com.teamify.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<University> getUniversity(@PathVariable int id) {
        return universityService.findUniversityById(id)
                .map( university -> ResponseEntity.ok().body(university)) //200 OK
                .orElseGet( () -> ResponseEntity.notFound().build()); //404 not found
    }

    @PostMapping("/")
    public ResponseEntity<University> createUniversity(@RequestBody University university) {
        URI uriPath = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(universityService.create(university).getId())
                .toUri();
        return ResponseEntity.created(uriPath).build();
    }

}
