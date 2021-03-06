package com.greenfox.caloriecounter.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Anna on 17/01/10.
 */
@Entity
@Table(name="meal_types")
@Getter
@Setter
@NoArgsConstructor
public class MealType {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(mappedBy = "type")
    private List<Meal> meals;
}
