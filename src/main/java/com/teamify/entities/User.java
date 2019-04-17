package com.teamify.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String fullName;

    private String emailAddress;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "projectOwner")
    private Set<Project> createdProjects;

    @ManyToMany
    private Set<Skill> userSkills;
}
