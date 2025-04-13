package com.code.blog.blogapp.service;

import com.code.blog.blogapp.entity.Blog;
import com.code.blog.blogapp.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private final BlogRepository repository;

    public BlogService(BlogRepository repository) {
        this.repository = repository;
    }

    public List<Blog> getAllBlogs() {
        return repository.findAll();
    }

    public Blog getBlog(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Blog addBlog(Blog blog) {
        return repository.save(blog);
    }

    public Blog likeBlog(Long id) {
        Blog blog = repository.findById(id).orElse(null);
        if (blog != null) {
            blog.setLikes(blog.getLikes() + 1);
            repository.save(blog);
        }
        return blog;
    }
}