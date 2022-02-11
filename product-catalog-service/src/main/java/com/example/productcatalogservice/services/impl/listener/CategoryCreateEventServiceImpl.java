package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.CategoryCreateEvent;
import com.example.productcatalogservice.repositories.listener.CategoryCreateEventRepository;
import com.example.productcatalogservice.services.listener.CategoryCreateEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryCreateEventServiceImpl implements CategoryCreateEventService {
    @Autowired
    private CategoryCreateEventRepository repository;

    @Override
    public CategoryCreateEvent save(CategoryCreateEvent categoryCreateEvent) {
        return repository.save(categoryCreateEvent);
    }
}
