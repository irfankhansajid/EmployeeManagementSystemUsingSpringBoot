package com.example.springbootdemoproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_Name", nullable = false)
    private String firstName;
    @Column(name= "last_Name")
    private String lastName;
    @Column(name = "email")
    private String email;



}
