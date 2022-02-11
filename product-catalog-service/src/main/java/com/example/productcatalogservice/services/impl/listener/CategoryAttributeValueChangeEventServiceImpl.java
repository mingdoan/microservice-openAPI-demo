package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.CategoryAttributeValueChangeEvent;
import com.example.productcatalogservice.repositories.listener.CategoryAttributeValueChangeEventRepository;
import com.example.productcatalogservice.services.listener.CategoryAttributeValueChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryAttributeValueChangeEventServiceImpl implements CategoryAttributeValueChangeEventService {
    @Autowired
    private CategoryAttributeValueChangeEventRepository repository;

    @Override
    public CategoryAttributeValueChangeEvent save(CategoryAttributeValueChangeEvent categoryAttributeValueChangeEvent) {
        return repository.save(categoryAttributeValueChangeEvent);
    }
}
