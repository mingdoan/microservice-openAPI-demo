package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.CategoryCreateEvent;
import com.example.productcatalogservice.services.listener.CategoryCreateEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/categoryCreateEvent")
public class CategoryCreateEventController {
    @Autowired
    private CategoryCreateEventService categoryCreateEventService;
    @PostMapping
    public ResponseEntity<CategoryCreateEvent> save(@RequestBody CategoryCreateEvent categoryCreateEvent) {
        CategoryCreateEvent savedCategoryCreateEvent = categoryCreateEventService.save(categoryCreateEvent);
        return ResponseEntity.ok().body(savedCategoryCreateEvent);
    }
}
