package com.greenfox.caloriecounter.services;

import com.greenfox.caloriecounter.models.Meal;
import com.greenfox.caloriecounter.repos.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by Anna on 17/01/10.
 */
@Service
public class MealService {

    @Autowired
    MealRepository repository;

    public Page<Meal> listPage(int pageNumber, int limit) {
        return repository.findAll(new PageRequest(pageNumber, limit));
    }

    public void saveMeal(Meal meal) {
        repository.save(meal);
    }

    public Meal find(long id) {
        return repository.findOne(id);
    }

    public void delete(long id) {
        repository.delete(id);
    }
}
