package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.CatalogBatchEvent;
import com.example.productcatalogservice.services.listener.CatalogBatchEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/catalogBatchEvent")
public class CatalogBatchEventController {
    @Autowired
    private CatalogBatchEventService catalogBatchEventService;
    @PostMapping
    public ResponseEntity<CatalogBatchEvent> save(@RequestBody CatalogBatchEvent catalogBatchEvent) {
        CatalogBatchEvent savedCatalogBatchEvent = catalogBatchEventService.save(catalogBatchEvent);
        return ResponseEntity.ok().body(savedCatalogBatchEvent);
    }
}
