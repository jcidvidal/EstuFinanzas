package com.finanzas.Backend.services;


import com.finanzas.Backend.models.Category;
import com.finanzas.Backend.models.CategoryType;
import com.finanzas.Backend.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAllByType(CategoryType type) {
        return categoryRepository.findByType(type);
    }


}
