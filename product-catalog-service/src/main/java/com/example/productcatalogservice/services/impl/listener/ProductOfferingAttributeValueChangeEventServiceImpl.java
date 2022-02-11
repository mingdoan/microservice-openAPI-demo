package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.ProductOfferingAttributeValueChangeEvent;
import com.example.productcatalogservice.repositories.listener.ProductOfferingAttributeValueChangeEventRepository;
import com.example.productcatalogservice.services.listener.ProductOfferingAttributeValueChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductOfferingAttributeValueChangeEventServiceImpl implements ProductOfferingAttributeValueChangeEventService {
    @Autowired
    private ProductOfferingAttributeValueChangeEventRepository repository;

    @Override
    public ProductOfferingAttributeValueChangeEvent save(ProductOfferingAttributeValueChangeEvent productOfferingAttributeValueChangeEvent) {
        return repository.save(productOfferingAttributeValueChangeEvent);
    }
}
