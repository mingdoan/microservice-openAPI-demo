package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.ProductOfferingStateChangeEvent;
import com.example.productcatalogservice.repositories.listener.ProductOfferingStateChangeEventRepository;
import com.example.productcatalogservice.services.listener.ProductOfferingStateChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductOfferingStateChangeEventServiceImpl implements ProductOfferingStateChangeEventService {
    @Autowired
    private ProductOfferingStateChangeEventRepository repository;

    @Override
    public ProductOfferingStateChangeEvent save(ProductOfferingStateChangeEvent productOfferingStateChangeEvent) {
        return repository.save(productOfferingStateChangeEvent);
    }
}
