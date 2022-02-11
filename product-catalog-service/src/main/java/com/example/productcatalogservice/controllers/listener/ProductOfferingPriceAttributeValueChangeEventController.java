package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.ProductOfferingPriceAttributeValueChangeEvent;
import com.example.productcatalogservice.services.listener.ProductOfferingPriceAttributeValueChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/productOfferingPriceAttributeValueChangeEvent")
public class ProductOfferingPriceAttributeValueChangeEventController {
    @Autowired
    private ProductOfferingPriceAttributeValueChangeEventService productOfferingPriceAttributeValueChangeEventService;
    @PostMapping
    public ResponseEntity<ProductOfferingPriceAttributeValueChangeEvent> save(@RequestBody ProductOfferingPriceAttributeValueChangeEvent productOfferingPriceAttributeValueChangeEvent) {
        ProductOfferingPriceAttributeValueChangeEvent savedProductOfferingPriceAttributeValueChangeEvent = productOfferingPriceAttributeValueChangeEventService.save(productOfferingPriceAttributeValueChangeEvent);
        return ResponseEntity.ok().body(savedProductOfferingPriceAttributeValueChangeEvent);
    }
}
