package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.CatalogBatchEvent;
import com.example.productcatalogservice.models.CatalogCreateEvent;

public interface CatalogBatchEventService {
    CatalogBatchEvent save(CatalogBatchEvent catalogBatchEvent);
}
