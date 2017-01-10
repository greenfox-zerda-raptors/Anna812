package com.greenfox.anna.reddit.services;

import com.greenfox.anna.reddit.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Anna on 17/01/06.
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public boolean isValidUser(User userToAuth) {
        return userRepository.findByName(userToAuth.getName()) != null &&
                userRepository.findByPassword(userToAuth.getPassword()) != null;
    }


    public String getUserId(User userToAuth) {
        Long l = userRepository.findByName(userToAuth.getName()).getUserId();
        return l.toString();
    }
}
