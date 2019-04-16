package com.codegym.bl.repository;

import com.codegym.bl.model.Blog;
import com.codegym.bl.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog,Long> {
    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAllByTitle(String title, Pageable pageable);
}
