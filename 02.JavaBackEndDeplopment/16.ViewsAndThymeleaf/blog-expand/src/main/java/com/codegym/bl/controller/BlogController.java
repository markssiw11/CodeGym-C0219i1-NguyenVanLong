package com.codegym.bl.controller;

import com.codegym.bl.model.Blog;
import com.codegym.bl.model.Category;
import com.codegym.bl.service.BlogService;
import com.codegym.bl.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;
    @ModelAttribute("categories")
    public Iterable<Category> categories(){
        return categoryService.findAll();
    }

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("success", "create succed");
        return modelAndView;
    }

    @GetMapping("/blogs")
    public ModelAndView listBlog(@RequestParam("s") Optional<String> s, Pageable pageable) {
        Page<Blog> blogs;
        if(s.isPresent()){
            blogs = blogService.findAllByTitle(s.get(), pageable);
        } else {
            blogs = blogService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @GetMapping("/blog/{id}/view")
    public ModelAndView viewBlog(@PathVariable Long id) {
        Blog blog = blogService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/blog/view");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @GetMapping("/blog/{id}/update")
    public ModelAndView showUpdateBlog(@PathVariable Long id) {

        Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/update");
            modelAndView.addObject("blog", blog);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/update-blog")
    public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        ModelAndView modelAndView= new ModelAndView("/blog/update");
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("success","update succed");
        return modelAndView;

    }
    @GetMapping("blog/{id}/delete")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Blog blog = blogService.findById(id);
        if(blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/delete");
            modelAndView.addObject("blog", blog);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-blog")
    public String deleteBlog(@ModelAttribute("blog") Blog blog){
        blogService.remove(blog.getId());
        return "redirect:blogs";
    }
}
