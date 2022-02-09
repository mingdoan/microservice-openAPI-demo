package com.example.productcatalogservice.controllers;


import com.example.productcatalogservice.models.Catalog;
import com.example.productcatalogservice.repositories.CatalogRepository;
import com.example.productcatalogservice.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/catalog")
public class CatalogController {
    @Autowired
    private CatalogService catalogService;
    @Autowired
    private CatalogRepository catalogRepository;

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
    public ResponseEntity<Catalog> save(@RequestBody Catalog catalog) {
        Catalog savedCatalog = catalogService.save(catalog);
        return ResponseEntity.ok().body(savedCatalog);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Catalog> patchCatalog(@PathVariable("id") String id,@RequestBody Catalog catalog) {
        Optional<Catalog> catalogData = catalogRepository.findById(id);
        if (catalogData.isPresent()) {
            Catalog catalog1 = catalogData.get();
            catalog1.setCatalogType(catalog.getCatalogType());
            catalog1.setAtBaseType(catalog.getAtBaseType());
            return new ResponseEntity<>(catalogRepository.save(catalog1), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<HttpStatus> deleteCatalog(@PathVariable("id") String id) {
//        try {
//            catalogRepository.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    @DeleteMapping("/{id}")
    public String deleteCatalog(@PathVariable String id){
        catalogRepository.deleteById(id);

        return "Deleted Successfully";
    }
}
