package com.codegym.bl.service.impl;

import com.codegym.bl.model.Blog;
import com.codegym.bl.model.Category;
import com.codegym.bl.repository.BlogRepository;
import com.codegym.bl.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {

        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllByTitle(String title, Pageable pageable) {
        return blogRepository.findAllByTitle(title, pageable);
    }

    @Override
    public Iterable<Blog> findAllByCategory(Category category) {
        return blogRepository.findAllByCategory(category);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findOne(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.delete(id);
    }
}
