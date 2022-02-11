package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.ProductOfferingDeleteEvent;

public interface ProductOfferingDeleteEventService {
    ProductOfferingDeleteEvent save(ProductOfferingDeleteEvent productOfferingDeleteEvent);
}
