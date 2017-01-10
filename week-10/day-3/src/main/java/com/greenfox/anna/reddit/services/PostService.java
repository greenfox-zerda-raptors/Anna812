package com.greenfox.anna.reddit.services;

import com.greenfox.anna.reddit.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anna on 17/01/05.
 */
@Service
public class PostService {

    @Autowired
    private PostRepository repository;
    private PagedListHolder<Post> pages;

    public List<Post> listPosts(int pageNumber) {
        pages = new PagedListHolder<>(repository.findAllByOrderByScoreDesc());
        pages.setPageSize(10);
        pages.setPage(pageNumber-1);
        return pages.getPageList();
    }

    public List<Post> listUserPosts(long userId) {
        return repository.findAllByUserUserId(userId);
    }

    public void savePost(Post post) {
        repository.save(post);
    }

    public void upvotePost(long id) {
        Post post = repository.findOne(id);
        post.incrementScore();
        savePost(post);
    }

    public void downvotePost(long id) {
        Post post = repository.findOne(id);
        post.decrementScore();
        savePost(post);
    }

    public int getPreviousPageNumber() {
        return pages.getPage();
    }

    public int getNextPageNumber() {
        return pages.getPage() + 2;
    }

}
