package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.CatalogDeleteEvent;
import com.example.productcatalogservice.models.CatalogStateChangeEvent;

public interface CatalogStateChangeEventService {
    CatalogStateChangeEvent save(CatalogStateChangeEvent catalogStateChangeEvent);
}
