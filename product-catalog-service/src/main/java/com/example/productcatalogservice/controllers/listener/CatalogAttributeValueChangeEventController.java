package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.CatalogAttributeValueChangeEvent;
import com.example.productcatalogservice.services.listener.CatalogAttributeValueChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/catalogAttributeValueChangeEvent")
public class CatalogAttributeValueChangeEventController {
    @Autowired
    private CatalogAttributeValueChangeEventService catalogAttributeValueChangeEventService;
    @PostMapping
    public ResponseEntity<CatalogAttributeValueChangeEvent> save(@RequestBody CatalogAttributeValueChangeEvent catalogAttributeValueChangeEvent) {
        CatalogAttributeValueChangeEvent savedCatalogAttributeValueChangeEvent = catalogAttributeValueChangeEventService.save(catalogAttributeValueChangeEvent);
        return ResponseEntity.ok().body(savedCatalogAttributeValueChangeEvent);
    }
}
