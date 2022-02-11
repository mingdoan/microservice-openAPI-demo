package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.api.ApiUtil;
import com.example.productcatalogservice.models.CatalogCreateEvent;
import com.example.productcatalogservice.models.EventSubscription;
import com.example.productcatalogservice.repositories.listener.CatalogCreateEventRepository;
import com.example.productcatalogservice.services.listener.CatalogAttributeValueChangeEventService;
import com.example.productcatalogservice.services.listener.CatalogCreateEventService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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
