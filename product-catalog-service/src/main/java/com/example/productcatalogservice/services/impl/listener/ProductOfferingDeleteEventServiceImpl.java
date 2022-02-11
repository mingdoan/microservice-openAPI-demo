package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.ProductOfferingDeleteEvent;
import com.example.productcatalogservice.repositories.listener.ProductOfferingDeleteEventRepository;
import com.example.productcatalogservice.services.listener.ProductOfferingDeleteEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductOfferingDeleteEventServiceImpl implements ProductOfferingDeleteEventService {
    @Autowired
    private ProductOfferingDeleteEventRepository repository;

    @Override
    public ProductOfferingDeleteEvent save(ProductOfferingDeleteEvent productOfferingDeleteEvent) {
        return repository.save(productOfferingDeleteEvent);
    }
}
