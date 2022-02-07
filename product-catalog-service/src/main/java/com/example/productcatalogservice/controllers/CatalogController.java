package com.example.productcatalogservice.controllers;


import com.example.productcatalogservice.models.Catalog;
import com.example.productcatalogservice.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/catalog")
public class CatalogController {
    @Autowired
    private CatalogService catalogService;

//    @PostMapping("/addBook")
//    public String saveBook(@RequestBody Catalog catalog){
//        repo.save(book);
//
//        return "Added Successfully";
//    }

    @GetMapping
    public List<Catalog> getAll() {
        return catalogService.getAll();
    }


    @PostMapping
    public ResponseEntity<?> save(@RequestBody Catalog catalog) {
        Catalog savedCatalog = catalogService.save(catalog);
        return ResponseEntity.ok().body(savedCatalog);
    }

//    @DeleteMapping("/delete/{id}")
//    public String deleteBook(@PathVariable int id){
//        repo.deleteById(id);
//
//        return "Deleted Successfully";
//    }
}
