package com.teamify.utils;

import com.teamify.entities.Project;
import com.teamify.entities.University;
import com.teamify.main.Application;
import com.teamify.repositories.ProjectRepository;
import com.teamify.repositories.UniversityRepository;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.Date;
import java.util.*;

/**
 *Temporary utility to load some mock data into repositories until we set-up database access and db server.
 **/
@Component
public class MockDataLoader {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Getter
    private List<Project> mockProjects = new ArrayList<>();

    @Getter
    private List<University> mockUniversiies = new ArrayList<>();

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UniversityRepository universityRepository;
    /**
     * Function to load all the mock data in the application.
     */
    @PostConstruct
    public void loadAllData() {
        log.info("Adding mock data");
        //ORDER MATTERS!
        loadSkills();
        loadUniversities();
        loadProjects();
        loadUsers();
    }

    private void loadUniversities() {
        mockUniversiies.add(new University(31212,"University of Florida",282005l));
        mockUniversiies.add(new University(31213,"University of Texas",333005l));
        universityRepository.saveAll(getMockUniversiies());
    }

    private void loadUsers() {
    }

    private void loadSkills() {
    }

    public void loadProjects()
    {
/*
        University university = mockUniversiies.get(0);
        Project project1 = new Project(12345,
                "Mock Project 1",
                "Mo2ck Daaescription A",
                new Date(Calendar.getInstance().getTime().getTime()),
                university);

        Project project2 = new Project(12347,
                "Mock Project 3",
                "Mo1ck Descrifsption C",
                new Date(Calendar.getInstance().getTime().getTime()),
                university);

        mockProjects.add(project1);
        mockProjects.add(project2);
        university.setProjects(new HashSet<>(mockProjects));
        universityRepository.save(university);*/
    }
}
