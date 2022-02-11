package com.example.productcatalogservice.services.impl;

import com.example.productcatalogservice.models.EventSubscriptionInput;
import com.example.productcatalogservice.repositories.HubRepository;
import com.example.productcatalogservice.services.HubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HubServiceImpl implements HubService {
    @Autowired
    private HubRepository repository;

    @Override
    public EventSubscriptionInput save(EventSubscriptionInput eventSubscriptionInput) {
        return repository.save(eventSubscriptionInput);
    }
}
