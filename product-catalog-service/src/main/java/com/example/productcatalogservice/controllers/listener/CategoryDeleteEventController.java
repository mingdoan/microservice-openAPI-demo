package com.example.productcatalogservice.controllers.listener;

import com.example.productcatalogservice.models.CategoryDeleteEvent;
import com.example.productcatalogservice.services.listener.CategoryDeleteEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/listener/categoryDeleteEvent")
public class CategoryDeleteEventController {
    @Autowired
    private CategoryDeleteEventService categoryDeleteEventService;
    @PostMapping
    public ResponseEntity<CategoryDeleteEvent> save(@RequestBody CategoryDeleteEvent categoryDeleteEvent) {
        CategoryDeleteEvent savedCategoryDeleteEvent = categoryDeleteEventService.save(categoryDeleteEvent);
        return ResponseEntity.ok().body(savedCategoryDeleteEvent);
    }
}
