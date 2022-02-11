package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.CatalogStateChangeEvent;
import com.example.productcatalogservice.services.listener.CatalogStateChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/catalogStateChangeEvent")
public class CatalogStateChangeEventController {
    @Autowired
    private CatalogStateChangeEventService catalogStateChangeEventService;
    @PostMapping
    public ResponseEntity<CatalogStateChangeEvent> save(@RequestBody CatalogStateChangeEvent catalogStateChangeEvent) {
        CatalogStateChangeEvent savedCatalogStateChangeEvent = catalogStateChangeEventService.save(catalogStateChangeEvent);
        return ResponseEntity.ok().body(savedCatalogStateChangeEvent);
    }
}
