package com.teamify.services;

import com.teamify.entities.Project;
import com.teamify.repositories.ProjectRepository;
import com.teamify.utils.MockDataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    public List<Project> getAllProjects() {
        List<Project> result = new ArrayList<>();
        projectRepository.findAll().forEach(result::add);
        return result;
    }
}
