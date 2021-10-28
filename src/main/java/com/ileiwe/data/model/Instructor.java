package com.ileiwe.data.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private Gender gender;
    private String specialization;
    @Column(length = 1000)
    private String bio;
    @OneToOne
    @JoinColumn // this is created so that the Instuctor table will have an extra column to holds the id
    // of the learning party
    private  LearningParty learningParty;
    @OneToMany
    private List<Course>courses;
}
