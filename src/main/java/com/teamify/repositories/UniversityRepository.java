package com.teamify.repositories;

import com.teamify.entities.Project;
import org.springframework.data.repository.CrudRepository;

public interface UniversityRepository extends CrudRepository<Project, Long> {
}
