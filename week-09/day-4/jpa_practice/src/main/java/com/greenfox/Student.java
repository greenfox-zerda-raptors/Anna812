package com.greenfox;

import javax.persistence.*;

/**
 * Created by Anna on 17/01/02.
 */

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue()
    long id;
    String lastName;
    String group;
}
