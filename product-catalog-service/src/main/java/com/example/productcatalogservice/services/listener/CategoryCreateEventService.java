package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.CategoryAttributeValueChangeEvent;
import com.example.productcatalogservice.models.CategoryCreateEvent;

public interface CategoryCreateEventService {
    CategoryCreateEvent save(CategoryCreateEvent categoryCreateEvent);
}
