package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.CatalogDeleteEvent;
import com.example.productcatalogservice.repositories.listener.CatalogDeleteEventRepository;
import com.example.productcatalogservice.services.listener.CatalogDeleteEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogDeleteEventServiceImpl implements CatalogDeleteEventService {
    @Autowired
    private CatalogDeleteEventRepository repository;

    @Override
    public CatalogDeleteEvent save(CatalogDeleteEvent catalogDeleteEvent) {
        return repository.save(catalogDeleteEvent);
    }
}
