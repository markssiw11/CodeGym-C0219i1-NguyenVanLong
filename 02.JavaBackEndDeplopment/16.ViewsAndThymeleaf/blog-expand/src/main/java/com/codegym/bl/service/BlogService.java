package com.codegym.bl.service;

import com.codegym.bl.model.Blog;
import com.codegym.bl.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllByTitle(String title, Pageable pageable);
    Iterable<Blog> findAllByCategory(Category category);
    Blog findById(Long id);
    void save(Blog blog);
    void remove(Long id);
}
