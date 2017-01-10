package com.greenfox.caloriecounter.services;

import com.greenfox.caloriecounter.models.MealType;
import com.greenfox.caloriecounter.repos.MealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Anna on 17/01/10.
 */
@Service
public class MealTypeService {

    @Autowired
    private MealTypeRepository repository;

    public Iterable<MealType> list() {
        return repository.findAll();
    }
}
