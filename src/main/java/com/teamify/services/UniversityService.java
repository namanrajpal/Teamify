package com.teamify.services;

import com.teamify.entities.University;
import com.teamify.repositories.UniversityRepository;
import com.teamify.utils.MockDataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    public List<University> getAllUniversities() {
        List<University> result = new ArrayList<>();
        universityRepository.findAll().forEach(result::add);
        return result;
    }
}
