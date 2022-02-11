package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.ProductOfferingDeleteEvent;
import com.example.productcatalogservice.services.listener.ProductOfferingDeleteEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/productOfferingDeleteEvent")
public class ProductOfferingDeleteEventController {
    @Autowired
    private ProductOfferingDeleteEventService productOfferingDeleteEventService;
    @PostMapping
    public ResponseEntity<ProductOfferingDeleteEvent> save(@RequestBody ProductOfferingDeleteEvent productOfferingDeleteEvent) {
        ProductOfferingDeleteEvent savedProductOfferingDeleteEvent = productOfferingDeleteEventService.save(productOfferingDeleteEvent);
        return ResponseEntity.ok().body(savedProductOfferingDeleteEvent);
    }
}
