package com.greenfox.caloriecounter.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Anna on 17/01/10.
 */
@Entity
@Table(name = "meals")
@Getter
@Setter
@NoArgsConstructor
public class Meal {
    @Id
    @GeneratedValue
    private long id;
    private String created;
    @ManyToOne
    @JoinColumn(name = "mealtype_id")
    private MealType type;
    private String description;
    private int calories;
}
