package com.example.productcatalogservice.services.impl;

import com.example.productcatalogservice.models.Catalog;
import com.example.productcatalogservice.models.Category;
import com.example.productcatalogservice.repositories.CatalogRepository;
import com.example.productcatalogservice.repositories.CategoryRepository;
import com.example.productcatalogservice.services.CatalogService;
import com.example.productcatalogservice.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository repository;

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }

    @Override
    public Category save(Category category) {
        return repository.save(category);
    }
}
