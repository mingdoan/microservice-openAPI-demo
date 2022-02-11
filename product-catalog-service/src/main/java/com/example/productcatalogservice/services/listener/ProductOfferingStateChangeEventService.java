package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.ProductOfferingStateChangeEvent;

public interface ProductOfferingStateChangeEventService {
    ProductOfferingStateChangeEvent save(ProductOfferingStateChangeEvent productOfferingStateChangeEvent);
}
