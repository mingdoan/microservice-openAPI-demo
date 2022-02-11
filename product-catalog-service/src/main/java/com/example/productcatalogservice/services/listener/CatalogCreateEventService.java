package com.example.productcatalogservice.services.listener;

import com.example.productcatalogservice.models.CatalogCreateEvent;
import com.example.productcatalogservice.models.EventSubscription;

public interface CatalogCreateEventService {
    CatalogCreateEvent save(CatalogCreateEvent catalogCreateEvent);

}
