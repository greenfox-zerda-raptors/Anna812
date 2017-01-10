package com.greenfox.anna.reddit.services;

import com.greenfox.anna.reddit.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anna on 17/01/06.
 */
public interface UserRepository extends CrudRepository <User, Long> {

    User findByName(String name);
    User findByPassword(String password);
}
