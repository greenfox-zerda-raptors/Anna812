package com.greenfox;

import javax.persistence.*;

/**
 * Created by Anna on 17/01/02.
 */

@Entity
@Table(name = "grades")
public class Grade {

    int grade;

    @OneToMany
    @JoinColumn(name = "student_id")
    Student student;

    @OneToMany
    @JoinColumn(name = "class_id")
    Class aClass;
}
