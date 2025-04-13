package com.code.blog.blogapp.repository;

import com.code.blog.blogapp.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
