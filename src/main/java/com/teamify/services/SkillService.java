package com.teamify.services;

import com.teamify.entities.Skill;
import com.teamify.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;


    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    public Optional<Skill> findSkillById(int id) {
        return skillRepository.findById(id);
    }

    public Skill create(Skill skill) {
        return skillRepository.save(skill);
    }


}
