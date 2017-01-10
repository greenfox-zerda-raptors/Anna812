package com.greenfox.caloriecounter.repos;

import com.greenfox.caloriecounter.models.Meal;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anna on 17/01/10.
 */
public interface MealRepository extends CrudRepository<Meal, Long> {
}
