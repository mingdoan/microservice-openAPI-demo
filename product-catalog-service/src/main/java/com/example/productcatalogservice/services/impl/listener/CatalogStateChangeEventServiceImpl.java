package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.CatalogStateChangeEvent;
import com.example.productcatalogservice.repositories.listener.CatalogStateChangeEventRepository;
import com.example.productcatalogservice.services.listener.CatalogStateChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogStateChangeEventServiceImpl implements CatalogStateChangeEventService {
    @Autowired
    private CatalogStateChangeEventRepository repository;

    @Override
    public CatalogStateChangeEvent save(CatalogStateChangeEvent catalogStateChangeEvent) {
        return repository.save(catalogStateChangeEvent);
    }
}
