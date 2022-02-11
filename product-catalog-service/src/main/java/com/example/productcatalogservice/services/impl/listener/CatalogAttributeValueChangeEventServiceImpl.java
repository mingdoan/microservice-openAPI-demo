package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.CatalogAttributeValueChangeEvent;
import com.example.productcatalogservice.repositories.listener.CatalogAttributeValueChangeEventRepository;
import com.example.productcatalogservice.services.listener.CatalogAttributeValueChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogAttributeValueChangeEventServiceImpl implements CatalogAttributeValueChangeEventService {
    @Autowired
    private CatalogAttributeValueChangeEventRepository repository;

    @Override
    public CatalogAttributeValueChangeEvent save(CatalogAttributeValueChangeEvent catalogAttributeValueChangeEvent) {
        return repository.save(catalogAttributeValueChangeEvent);
    }
}
