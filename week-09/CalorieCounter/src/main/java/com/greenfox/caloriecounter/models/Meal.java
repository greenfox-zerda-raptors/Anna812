package com.greenfox.caloriecounter.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Anna on 17/01/10.
 */
@Entity
@Table(name = "meals")
@Getter
@Setter
public class Meal {
    @Id
    @GeneratedValue
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    private String type;
    private String description;
    private int calories;

    public Meal() {
        created = new Date();
    }
}
