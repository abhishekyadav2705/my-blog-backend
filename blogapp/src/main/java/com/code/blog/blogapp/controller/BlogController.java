package com.code.blog.blogapp.controller;

import com.code.blog.blogapp.entity.Blog;
import com.code.blog.blogapp.service.BlogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://abhishekyadavsblogs.netlify.app"})
@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    private final BlogService service;

    public BlogController(BlogService service) {
        this.service = service;
    }

    @GetMapping
    public List<Blog> getAllBlogs() {
        return service.getAllBlogs();
    }

    @GetMapping("/{id}")
    public Blog getBlog(@PathVariable Long id) {
        return service.getBlog(id);
    }

    @PostMapping
    public Blog addBlog(@RequestBody Blog blog) {
        return service.addBlog(blog);
    }

    @PostMapping("/{id}/like")
    public Blog likeBlog(@PathVariable Long id) {
        return service.likeBlog(id);
    }
}
