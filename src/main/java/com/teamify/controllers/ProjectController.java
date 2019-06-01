package com.teamify.controllers;

import com.teamify.entities.Project;
import com.teamify.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping(path = "/help")
    public String getTest() {
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
}
