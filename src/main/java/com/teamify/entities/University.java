package com.teamify.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class University {

    @Id
    @Column(name = "university_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;
    private long zipcode;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Project> projects = new HashSet<>();

    public University(int id, String name, long zipcode) {
        this.id = id;
        this.name = name;
        this.zipcode = zipcode;
    }
}
