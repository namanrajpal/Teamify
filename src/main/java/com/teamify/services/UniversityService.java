package com.teamify.services;

import com.teamify.entities.University;
import com.teamify.repositories.UniversityRepository;
import com.teamify.utils.MockDataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    public Optional<University> findUniversityById(int id) {
        return universityRepository.findById(id);
    }

    public University create(University university) {
        return universityRepository.save(university);
    }
}
