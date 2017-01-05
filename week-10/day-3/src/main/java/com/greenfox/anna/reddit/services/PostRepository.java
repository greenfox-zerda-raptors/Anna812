package com.greenfox.anna.reddit.services;

import com.greenfox.anna.reddit.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Anna on 17/01/04.
 */
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findTop10ByOrderByScoreDesc();

    List<Post> findAllByOrderByScoreDesc();
}
