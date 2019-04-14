package com.teamify.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "project_id")
    private final long id;

    private String title;

    private String description;

    private Date created;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;
    //private Set<Skill> skillSet = new HashSet<Skill>();

}
