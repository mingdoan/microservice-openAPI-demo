package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.CategoryStateChangeEvent;
import com.example.productcatalogservice.repositories.listener.CategoryStateChangeEventRepository;
import com.example.productcatalogservice.services.listener.CategoryStateChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryStateChangeEventServiceImpl implements CategoryStateChangeEventService {
    @Autowired
    private CategoryStateChangeEventRepository repository;

    @Override
    public CategoryStateChangeEvent save(CategoryStateChangeEvent categoryStateChangeEvent) {
        return repository.save(categoryStateChangeEvent);
    }
}
