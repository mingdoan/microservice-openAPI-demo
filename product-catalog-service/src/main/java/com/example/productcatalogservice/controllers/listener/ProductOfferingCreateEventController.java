package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.ProductOfferingCreateEvent;
import com.example.productcatalogservice.services.listener.ProductOfferingCreateEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/productOfferingCreateEvent")
public class ProductOfferingCreateEventController {
    @Autowired
    private ProductOfferingCreateEventService productOfferingCreateEventService;
    @PostMapping
    public ResponseEntity<ProductOfferingCreateEvent> save(@RequestBody ProductOfferingCreateEvent productOfferingCreateEvent) {
        ProductOfferingCreateEvent savedProductOfferingCreateEvent = productOfferingCreateEventService.save(productOfferingCreateEvent);
        return ResponseEntity.ok().body(savedProductOfferingCreateEvent);
    }
}
