package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.CatalogBatchEvent;
import com.example.productcatalogservice.models.CatalogCreateEvent;
import com.example.productcatalogservice.repositories.listener.CatalogBatchEventRepository;
import com.example.productcatalogservice.repositories.listener.CatalogCreateEventRepository;
import com.example.productcatalogservice.services.listener.CatalogBatchEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogBatchEventServiceImpl implements CatalogBatchEventService {
    @Autowired
    private CatalogBatchEventRepository repository;

    @Override
    public CatalogBatchEvent save(CatalogBatchEvent catalogBatchEvent) {
        return repository.save(catalogBatchEvent);
    }

}
