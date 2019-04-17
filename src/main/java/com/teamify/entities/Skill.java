package com.teamify.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String skill;

    @ManyToMany (mappedBy = "requiredSkills")
    private Set<Project> projects;

    @ManyToMany(mappedBy = "userSkills")
    private Set<User> users;
}
