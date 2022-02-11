package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.ProductOfferingPriceCreateEvent;
import com.example.productcatalogservice.services.listener.ProductOfferingPriceCreateEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/productOfferingPriceCreateEvent")
public class ProductOfferingPriceCreateEventController {
    @Autowired
    private ProductOfferingPriceCreateEventService productOfferingPriceCreateEventService;
    @PostMapping
    public ResponseEntity<ProductOfferingPriceCreateEvent> save(@RequestBody ProductOfferingPriceCreateEvent productOfferingPriceCreateEvent) {
        ProductOfferingPriceCreateEvent savedProductOfferingPriceCreateEvent = productOfferingPriceCreateEventService.save(productOfferingPriceCreateEvent);
        return ResponseEntity.ok().body(savedProductOfferingPriceCreateEvent);
    }
}
