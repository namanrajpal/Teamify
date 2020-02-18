package com.teamify.services;

import com.teamify.entities.Project;
import com.teamify.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(int id) {
        return projectRepository.findById(id);
    }

    public int createProject(Project project) throws ResponseStatusException {
        //if user has not entered a date, we will enter today's date.
        if (project.getCreated() == null) {
            project.setCreated(new Date(Calendar.getInstance().getTime().getTime()));
        }
        validateProject(project);
        Project newProject =  projectRepository.save(project);
        projectRepository.flush();
        return newProject.getId();
    }

    private void validateProject(Project project) {
        if (StringUtils.isEmpty(project.getTitle())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Title is empty");
        }
    }
}
