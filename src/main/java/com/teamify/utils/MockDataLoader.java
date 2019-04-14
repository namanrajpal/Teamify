package com.teamify.utils;

import com.teamify.entities.Project;
import com.teamify.main.Application;
import com.teamify.repositories.ProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.Calendar;

/**
 *Temporary utility to load some mock data into repositories until we set-up database access and db server.
 **/
public class MockDataLoader {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    private ProjectRepository projectRepository;
    /**
     * Function to load all the mock data in the application.
     */
    public void loadAllData() {
        log.info("Adding mock data");
        loadProjects();
        loadSkills();
        loadUniversities();
        loadUsers();
    }

    private void loadUniversities() {
    }

    private void loadUsers() {
    }

    private void loadSkills() {
    }

    public void loadProjects()
    {
        //projectRepository.save(new Project(12345,"Mock Project 1","Mo2ck Daaescription A", new Date(Calendar.getInstance().getTime().getTime())));
        //projectRepository.save(new Project(12346,"Mock Project 2","Moc2k Descsdfription B", new Date(Calendar.getInstance().getTime().getTime())));
        //projectRepository.save(new Project(12347,"Mock Project 3","Mo1ck Descrifsption C", new Date(Calendar.getInstance().getTime().getTime())));
        //projectRepository.save(new Project(12348,"Mock Project 4","Mocasdk Dsdfescription D", new Date(Calendar.getInstance().getTime().getTime())));
        //projectRepository.save(new Project(12349,"Mock Project 5","Mocaak Description E", new Date(Calendar.getInstance().getTime().getTime())));
        //projectRepository.save(new Project(12350,"Mock Project 6","Mocffk Description F", new Date(Calendar.getInstance().getTime().getTime())));
        //projectRepository.save(new Project(12351,"Mock Project 7","Mockggggg Description G", new Date(Calendar.getInstance().getTime().getTime())));
        //projectRepository.save(new Project(12352,"Mock Project 8","Moack Description I", new Date(Calendar.getInstance().getTime().getTime())));
    }
}
