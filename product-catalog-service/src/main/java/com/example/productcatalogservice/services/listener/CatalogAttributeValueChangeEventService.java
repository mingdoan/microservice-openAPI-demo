package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.CatalogAttributeValueChangeEvent;

public interface CatalogAttributeValueChangeEventService {
    CatalogAttributeValueChangeEvent save(CatalogAttributeValueChangeEvent catalogAttributeValueChangeEvent);
}
