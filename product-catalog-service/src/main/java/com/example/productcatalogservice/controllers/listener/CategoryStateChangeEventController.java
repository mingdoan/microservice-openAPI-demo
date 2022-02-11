package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.CategoryStateChangeEvent;
import com.example.productcatalogservice.services.listener.CategoryStateChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/categoryStateChangeEvent")
public class CategoryStateChangeEventController {
    @Autowired
    private CategoryStateChangeEventService categoryStateChangeEventService;
    @PostMapping
    public ResponseEntity<CategoryStateChangeEvent> save(@RequestBody CategoryStateChangeEvent categoryStateChangeEvent) {
        CategoryStateChangeEvent savedCategoryStateChangeEvent = categoryStateChangeEventService.save(categoryStateChangeEvent);
        return ResponseEntity.ok().body(savedCategoryStateChangeEvent);
    }
}
