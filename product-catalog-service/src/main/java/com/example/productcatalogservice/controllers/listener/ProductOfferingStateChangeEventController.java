package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.ProductOfferingStateChangeEvent;
import com.example.productcatalogservice.services.listener.ProductOfferingStateChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/productOfferingStateChangeEvent")
public class ProductOfferingStateChangeEventController {
    @Autowired
    private ProductOfferingStateChangeEventService productOfferingStateChangeEventService;
    @PostMapping
    public ResponseEntity<ProductOfferingStateChangeEvent> save(@RequestBody ProductOfferingStateChangeEvent productOfferingStateChangeEvent) {
        ProductOfferingStateChangeEvent savedProductOfferingStateChangeEvent = productOfferingStateChangeEventService.save(productOfferingStateChangeEvent);
        return ResponseEntity.ok().body(savedProductOfferingStateChangeEvent);
    }
}
