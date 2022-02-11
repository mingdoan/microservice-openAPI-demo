package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.ProductOfferingCreateEvent;
import com.example.productcatalogservice.repositories.listener.ProductOfferingCreateEventRepository;
import com.example.productcatalogservice.services.listener.ProductOfferingCreateEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductOfferingCreateEventServiceImpl implements ProductOfferingCreateEventService {
    @Autowired
    private ProductOfferingCreateEventRepository repository;

    @Override
    public ProductOfferingCreateEvent save(ProductOfferingCreateEvent productOfferingCreateEvent) {
        return repository.save(productOfferingCreateEvent);
    }
}
