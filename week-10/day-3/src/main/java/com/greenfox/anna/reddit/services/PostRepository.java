package com.greenfox.anna.reddit.services;

import com.greenfox.anna.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Anna on 17/01/04.
 */
public interface PostRepository extends CrudRepository<Post, Long> {

    List<Post> findAllByOrderByScoreDesc();

    List<Post> findAllByUserUserId(Long userId);
}
