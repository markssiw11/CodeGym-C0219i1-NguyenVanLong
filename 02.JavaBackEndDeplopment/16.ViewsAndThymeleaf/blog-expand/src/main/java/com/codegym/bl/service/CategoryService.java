package com.codegym.bl.service;

import com.codegym.bl.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void remove(Long id);
}
