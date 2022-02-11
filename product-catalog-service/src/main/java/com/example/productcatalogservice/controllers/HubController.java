package com.example.productcatalogservice.controllers;

import com.example.productcatalogservice.models.EventSubscriptionInput;
import com.example.productcatalogservice.repositories.HubRepository;
import com.example.productcatalogservice.services.HubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/hub")
public class HubController {
    @Autowired
    private HubService hubService;
    @Autowired
    private HubRepository hubRepository;

    @PostMapping
    public ResponseEntity<EventSubscriptionInput> save(@RequestBody EventSubscriptionInput eventSubscriptionInput) {
        EventSubscriptionInput savedEventSubscriptionInput = hubService.save(eventSubscriptionInput);
        return ResponseEntity.ok().body(savedEventSubscriptionInput);
    }

    @DeleteMapping("/{id}")
    public String deleteEventSubscriptionInput(@PathVariable String id){
        hubRepository.deleteById(id);

        return "Deleted Successfully";
    }
}
