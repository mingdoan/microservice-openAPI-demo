package com.example.productcatalogservice.services;

import com.example.productcatalogservice.models.Catalog;
import com.example.productcatalogservice.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Category save(Category category);
}
