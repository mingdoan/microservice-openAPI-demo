package com.example.productcatalogservice.services.impl.listener;

import com.example.productcatalogservice.models.CatalogCreateEvent;
import com.example.productcatalogservice.repositories.listener.CatalogCreateEventRepository;
import com.example.productcatalogservice.services.listener.CatalogCreateEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogCreateEventServiceImpl implements CatalogCreateEventService {
    @Autowired
    private CatalogCreateEventRepository repository;

    @Override
    public CatalogCreateEvent save(CatalogCreateEvent catalogCreateEvent) {
        return repository.save(catalogCreateEvent);
    }

}
