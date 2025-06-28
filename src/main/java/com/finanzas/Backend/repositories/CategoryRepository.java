package com.finanzas.Backend.repositories;


import com.finanzas.Backend.models.Category;
import com.finanzas.Backend.models.CategoryType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, String> {



    List<Category> findByType(CategoryType type);
}
