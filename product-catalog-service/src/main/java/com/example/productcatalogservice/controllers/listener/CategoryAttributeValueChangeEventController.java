package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.CategoryAttributeValueChangeEvent;
import com.example.productcatalogservice.services.listener.CategoryAttributeValueChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/categoryAttributeValueChangeEvent")
public class CategoryAttributeValueChangeEventController {
    @Autowired
    private CategoryAttributeValueChangeEventService categoryAttributeValueChangeEventService;
    @PostMapping
    public ResponseEntity<CategoryAttributeValueChangeEvent> save(@RequestBody CategoryAttributeValueChangeEvent categoryAttributeValueChangeEvent) {
        CategoryAttributeValueChangeEvent savedCategoryAttributeValueChangeEvent = categoryAttributeValueChangeEventService.save(categoryAttributeValueChangeEvent);
        return ResponseEntity.ok().body(savedCategoryAttributeValueChangeEvent);
    }
}
