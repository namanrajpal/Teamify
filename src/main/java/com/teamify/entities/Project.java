package com.teamify.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String title;

    private String description;

    private Date created;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn
    private University university;

    @ManyToMany
    private Set<Skill> requiredSkills;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private User projectOwner;

    /*@ManyToMany
    private Set<User> collaborators;*/
}
