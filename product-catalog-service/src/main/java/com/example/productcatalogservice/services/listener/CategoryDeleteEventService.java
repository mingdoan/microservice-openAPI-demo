package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.CategoryDeleteEvent;

public interface CategoryDeleteEventService {
    CategoryDeleteEvent save(CategoryDeleteEvent categoryDeleteEvent);
}
