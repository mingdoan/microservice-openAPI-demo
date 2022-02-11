package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.ProductOfferingPriceCreateEvent;

public interface ProductOfferingPriceCreateEventService {
    ProductOfferingPriceCreateEvent save(ProductOfferingPriceCreateEvent productOfferingPriceCreateEvent);
}
