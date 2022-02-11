package com.example.productcatalogservice.controllers;

import com.example.productcatalogservice.models.ProductOffering;
import com.example.productcatalogservice.repositories.ProductOfferingRepository;
import com.example.productcatalogservice.services.ProductOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/productOffering")
public class ProductOfferingController {
    @Autowired
    private ProductOfferingService productOfferingService;
    @Autowired
    private ProductOfferingRepository productOfferingRepository;

    @GetMapping
    public List<ProductOffering> getAll() {
        return productOfferingService.getAll();
    }


    @PostMapping
    public ResponseEntity<ProductOffering> save(@RequestBody ProductOffering productOffering) {
        ProductOffering savedProductOffering = productOfferingService.save(productOffering);
        return ResponseEntity.ok().body(savedProductOffering);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProductOffering> patchProductOffering(@PathVariable("id") String id, @RequestBody ProductOffering productOffering) {
        Optional<ProductOffering> productOfferingData = productOfferingRepository.findById(id);
        if (productOfferingData.isPresent()) {
            ProductOffering productOffering1 = productOfferingData.get();
            productOffering1.setAtSchemaLocation(productOffering.getAtSchemaLocation());
            productOffering1.setAtBaseType(productOffering.getAtBaseType());
            return new ResponseEntity<>(productOfferingRepository.save(productOffering1), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String deleteProductOffering(@PathVariable String id){
        productOfferingRepository.deleteById(id);

        return "Deleted Successfully";
    }
}
