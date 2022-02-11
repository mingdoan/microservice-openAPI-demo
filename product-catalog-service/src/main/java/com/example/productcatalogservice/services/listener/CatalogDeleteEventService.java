package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.CatalogDeleteEvent;

public interface CatalogDeleteEventService {
    CatalogDeleteEvent save(CatalogDeleteEvent catalogDeleteEvent);
}
