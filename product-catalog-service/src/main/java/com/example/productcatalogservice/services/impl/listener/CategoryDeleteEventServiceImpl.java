package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.CategoryDeleteEvent;
import com.example.productcatalogservice.repositories.listener.CategoryDeleteEventRepository;
import com.example.productcatalogservice.services.listener.CategoryDeleteEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryDeleteEventServiceImpl implements CategoryDeleteEventService {
    @Autowired
    private CategoryDeleteEventRepository repository;

    @Override
    public CategoryDeleteEvent save(CategoryDeleteEvent categoryDeleteEvent) {
        return repository.save(categoryDeleteEvent);
    }
}
