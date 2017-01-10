package com.greenfox.anna.reddit.controllers;

import com.greenfox.anna.reddit.models.Post;
import com.greenfox.anna.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Anna on 17/01/04.
 */
@Controller
public class RedditController {

    @Autowired
    PostService service;

    @RequestMapping("/")
    public String index (Model model) {
        model.addAttribute("posts", service.listPosts(1));
        return "index";
    }

    @GetMapping("/posts/add")
    public String addPostLayout (Model model) {
        model.addAttribute("post", new Post());
        return "add";
    }

    @PostMapping("/posts/create")
    public String addPost(@ModelAttribute Post post) {
        service.savePost(post);
        return "redirect:/";
    }

    @RequestMapping("/posts/{id}/upvote")
    public String upvote(@PathVariable long id) {
        service.upvotePost(id);
        return "redirect:/";
    }

    @RequestMapping("/posts/{id}/downvote")
    public String downvote(@PathVariable long id) {
        service.downvotePost(id);
        return "redirect:/";
    }

    @RequestMapping("/posts")
    public String displayPage(@RequestParam int pageNumber, Model model) {
        model.addAttribute("posts", service.listPosts(pageNumber));
        return "index";
    }

    @RequestMapping("/posts/user")
    public String displayUserPosts(@RequestParam long userId, Model model) {
        model.addAttribute("posts", service.listUserPosts(userId));
        return "index";
    }

    @RequestMapping("/posts/previousPage")
    public String displayPreviousPage() {
        return "redirect:/posts?pageNumber=" + service.getPreviousPageNumber();
    }

    @RequestMapping("/posts/nextPage")
    public String displayNextPage() {
        return "redirect:/posts?pageNumber=" + service.getNextPageNumber();
    }
}
