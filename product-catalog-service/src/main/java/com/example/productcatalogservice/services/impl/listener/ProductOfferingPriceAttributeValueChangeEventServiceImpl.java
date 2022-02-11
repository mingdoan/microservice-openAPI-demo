package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.ProductOfferingPriceAttributeValueChangeEvent;
import com.example.productcatalogservice.repositories.listener.ProductOfferingPriceAttributeValueChangeEventRepository;
import com.example.productcatalogservice.services.listener.ProductOfferingPriceAttributeValueChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductOfferingPriceAttributeValueChangeEventServiceImpl implements ProductOfferingPriceAttributeValueChangeEventService {
    @Autowired
    private ProductOfferingPriceAttributeValueChangeEventRepository repository;

    @Override
    public ProductOfferingPriceAttributeValueChangeEvent save(ProductOfferingPriceAttributeValueChangeEvent productOfferingPriceAttributeValueChangeEvent) {
        return repository.save(productOfferingPriceAttributeValueChangeEvent);
    }
}
