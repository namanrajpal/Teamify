package com.teamify.controllers;

import com.teamify.entities.Project;
import com.teamify.services.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/project")
public class ProjectController {

    private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);

    @Autowired
    private ProjectService projectService;

    @GetMapping(path = "/help")
    public String getHelp() {
        return "End point for returning information about projects";
    }

    /**
     * Controller to return all the projects. Note that this do not supports pagination
     * and thus will be a slow query, fetching everything
     * @return List of projects
     */
    @GetMapping(path = "/all")
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @GetMapping(value = "/{id}",  produces = "application/json")
    public ResponseEntity<Project> getProject(@PathVariable int id) {
        Optional<Project> project = projectService.getProjectById(id);
        return project
                .map( presentProject -> ResponseEntity.ok().body(presentProject))
                .orElseGet( () -> ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> createProject(@RequestBody Project project) throws Exception{
        logger.info("Creating a new project.");
        int newProjectId = projectService.createProject(project);
        URI uriPath = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newProjectId)
                .toUri();
        //Send location in response
        return ResponseEntity.created(uriPath).build();
    }
}
