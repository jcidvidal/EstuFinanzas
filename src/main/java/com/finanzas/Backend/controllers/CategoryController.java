package com.finanzas.Backend.controllers;


import com.finanzas.Backend.models.Category;
import com.finanzas.Backend.models.CategoryType;
import com.finanzas.Backend.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {


    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        Category saved = categoryService.saveCategory(category);
        return ResponseEntity.ok().body(saved);
    }

    @GetMapping("/type/{type}")
    public ResponseEntity <List<Category>> getByType(@PathVariable CategoryType type) {
        return ResponseEntity.ok(categoryService.getAllByType(type));
    }


}
