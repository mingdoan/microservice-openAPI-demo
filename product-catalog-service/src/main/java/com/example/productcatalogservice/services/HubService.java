package com.example.productcatalogservice.services;

import com.example.productcatalogservice.models.EventSubscriptionInput;

public interface HubService {
    EventSubscriptionInput save(EventSubscriptionInput eventSubscriptionInput);
}
