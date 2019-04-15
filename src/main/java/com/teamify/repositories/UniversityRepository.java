package com.teamify.repositories;

import com.teamify.entities.Project;
import com.teamify.entities.University;
import org.springframework.data.repository.CrudRepository;

public interface UniversityRepository extends CrudRepository<University, Long> {
}
