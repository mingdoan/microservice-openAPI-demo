package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.ProductOfferingCreateEvent;

public interface ProductOfferingCreateEventService {
    ProductOfferingCreateEvent save(ProductOfferingCreateEvent productOfferingCreateEvent);
}
