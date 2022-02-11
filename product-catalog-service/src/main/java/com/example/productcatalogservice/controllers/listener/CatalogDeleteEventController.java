package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.CatalogDeleteEvent;
import com.example.productcatalogservice.services.listener.CatalogDeleteEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/catalogDeleteEvent")
public class CatalogDeleteEventController {
    @Autowired
    private CatalogDeleteEventService catalogDeleteEventService;
    @PostMapping
    public ResponseEntity<CatalogDeleteEvent> save(@RequestBody CatalogDeleteEvent catalogDeleteEvent) {
        CatalogDeleteEvent savedCatalogDeleteEvent = catalogDeleteEventService.save(catalogDeleteEvent);
        return ResponseEntity.ok().body(savedCatalogDeleteEvent);
    }
}
