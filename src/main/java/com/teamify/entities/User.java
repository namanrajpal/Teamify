package com.teamify.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private int userId;

    private String fullName;

    private String emailAddress;
}
