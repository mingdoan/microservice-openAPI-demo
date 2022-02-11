package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.CatalogCreateEvent;
import com.example.productcatalogservice.services.listener.CatalogCreateEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/catalogCreateEvent")
public class CatalogCreateEventController {
    @Autowired
    private CatalogCreateEventService catalogCreateEventService;
   // private CatalogCreateEventRepository catalogCreateEventRepository;
    @PostMapping
    public ResponseEntity<CatalogCreateEvent> save(@RequestBody CatalogCreateEvent catalogCreateEvent) {
        CatalogCreateEvent savedCatalogCreateEvent = catalogCreateEventService.save(catalogCreateEvent);
        return ResponseEntity.ok().body(savedCatalogCreateEvent);
//        catalogCreateEventRepository.save(catalogCreateEvent);
//        return (ResponseEntity<CatalogCreateEvent>) ResponseEntity.ok();
    }

}
