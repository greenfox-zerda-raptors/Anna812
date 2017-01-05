package com.greenfox.anna.reddit.services;

import com.greenfox.anna.reddit.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * Created by Anna on 17/01/05.
 */
@Service
public class PostService {

    @Autowired
    private PostRepository repository;
    private PagedListHolder<Post> pages;

    public void listPosts(int pageNumber, Model model) {
        pages = new PagedListHolder<>(repository.findAllByOrderByScoreDesc());
        pages.setPageSize(10);
        pages.setPage(pageNumber-1);
        model.addAttribute("posts", pages.getPageList());
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


    public void listTop10Posts(Model model) {
        model.addAttribute("posts", repository.findTop10ByOrderByScoreDesc());
    }


    public int getPreviousPageNumber() {
        return pages.getPage();
    }

    public int getNextPageNumber() {
        return pages.getPage() + 2;
    }
}
