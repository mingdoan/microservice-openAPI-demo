package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.ProductOfferingPriceCreateEvent;
import com.example.productcatalogservice.repositories.listener.ProductOfferingPriceCreateEventRepository;
import com.example.productcatalogservice.services.listener.ProductOfferingPriceCreateEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductOfferingPriceCreateEventServiceImpl implements ProductOfferingPriceCreateEventService {
    @Autowired
    private ProductOfferingPriceCreateEventRepository repository;

    @Override
    public ProductOfferingPriceCreateEvent save(ProductOfferingPriceCreateEvent productOfferingPriceCreateEvent) {
        return repository.save(productOfferingPriceCreateEvent);
    }
}
