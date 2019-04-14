package com.teamify.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class University {

    @Id
    @Column(name = "university_id")
    private int id;

    private String name;
    private long zipcode;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Project> projects = new HashSet<Project>();
}
