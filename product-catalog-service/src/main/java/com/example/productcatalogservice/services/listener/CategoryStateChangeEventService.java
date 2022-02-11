package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.CategoryStateChangeEvent;

public interface CategoryStateChangeEventService {
    CategoryStateChangeEvent save(CategoryStateChangeEvent categoryStateChangeEvent);
}
