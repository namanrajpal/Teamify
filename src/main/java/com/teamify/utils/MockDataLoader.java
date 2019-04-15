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
        List<University> universities = new ArrayList<>();
        universityRepository.findAll().forEach(universities::add);
        Random random = new Random();

        University university = universities.get(random.nextInt(10)%2);
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


        mockProjects.add(new Project(12346,
                "Mock Project 2",
                "Moc2k Descsdfription B",
                new Date(Calendar.getInstance().getTime().getTime()),
                universities.get(random.nextInt(5)%2)));
        mockProjects.add(new Project(12348,
                "Mock Project 4",
                "Mocasdk Dsdfescription D",
                new Date(Calendar.getInstance().getTime().getTime()),
                universities.get(random.nextInt(5)%2)));
        mockProjects.add(new Project(12349,
                "Mock Project 5",
                "Mocaak Description E",
                new Date(Calendar.getInstance().getTime().getTime()),
                universities.get(random.nextInt(5)%2)));
        mockProjects.add(new Project(12350,
                "Mock Project 6",
                "Mocffk Description F",
                new Date(Calendar.getInstance().getTime().getTime()),
                universities.get(random.nextInt(5)%2)));
        mockProjects.add(new Project(12351,
                "Mock Project 7",
                "Mockggggg Description G",
                new Date(Calendar.getInstance().getTime().getTime()),
                universities.get(random.nextInt(5)%2)));
        projectRepository.saveAll(getMockProjects());

        //Set<Project> projects = new HashSet<>();
        //projects.add(project1);
        //projects.add(project2);
        //university.setProjects(projects);

        projectRepository.saveAll(getMockProjects());
    }
}
