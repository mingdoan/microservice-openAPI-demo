package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.ProductOfferingAttributeValueChangeEvent;
import com.example.productcatalogservice.services.listener.ProductOfferingAttributeValueChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/productOfferingAttributeValueChangeEvent")
public class ProductOfferingAttributeValueChangeEventController {
    @Autowired
    private ProductOfferingAttributeValueChangeEventService productOfferingAttributeValueChangeEventService;
    @PostMapping
    public ResponseEntity<ProductOfferingAttributeValueChangeEvent> save(@RequestBody ProductOfferingAttributeValueChangeEvent productOfferingAttributeValueChangeEvent) {
        ProductOfferingAttributeValueChangeEvent savedProductOfferingAttributeValueChangeEvent = productOfferingAttributeValueChangeEventService.save(productOfferingAttributeValueChangeEvent);
        return ResponseEntity.ok().body(savedProductOfferingAttributeValueChangeEvent);
    }
}
