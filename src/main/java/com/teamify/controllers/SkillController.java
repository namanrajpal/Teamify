package com.teamify.controllers;

import com.teamify.entities.Skill;
import com.teamify.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/skill")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping(path = "/help")
    public String getTest() {
        return "End point for returning information regarding skills.";
    }

    /**
     * Controller to return all the skills. Note that this do not supports pagination
     * and thus will be a slow query, fetching everything
     * @return List of skills
     */
    @GetMapping(path = "/all")
    public List<Skill> getAllSkills(){
        return skillService.getAllSkills();
    }
}
