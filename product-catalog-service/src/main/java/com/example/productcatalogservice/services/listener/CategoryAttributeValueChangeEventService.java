package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.CatalogStateChangeEvent;
import com.example.productcatalogservice.models.CategoryAttributeValueChangeEvent;

public interface CategoryAttributeValueChangeEventService {
    CategoryAttributeValueChangeEvent save(CategoryAttributeValueChangeEvent categoryAttributeValueChangeEvent);
}
