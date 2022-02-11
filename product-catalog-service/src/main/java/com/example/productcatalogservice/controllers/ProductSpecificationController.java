package com.example.productcatalogservice.controllers;

import com.example.productcatalogservice.models.ProductSpecification;
import com.example.productcatalogservice.repositories.ProductSpecificationRepository;
import com.example.productcatalogservice.services.ProductSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/productSpecification")
public class ProductSpecificationController {
    @Autowired
    private ProductSpecificationService productSpecificationService;
    @Autowired
    private ProductSpecificationRepository productSpecificationRepository;

    @GetMapping
    public List<ProductSpecification> getAll() {
        return productSpecificationService.getAll();
    }


    @PostMapping
    public ResponseEntity<ProductSpecification> save(@RequestBody ProductSpecification productSpecification) {
        ProductSpecification savedProductSpecification = productSpecificationService.save(productSpecification);
        return ResponseEntity.ok().body(savedProductSpecification);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProductSpecification> patchProductSpecification(@PathVariable("id") String id, @RequestBody ProductSpecification productSpecification) {
        Optional<ProductSpecification> productSpecificationData = productSpecificationRepository.findById(id);
        if (productSpecificationData.isPresent()) {
            ProductSpecification productSpecification1 = productSpecificationData.get();
            productSpecification1.setAtSchemaLocation(productSpecification.getAtSchemaLocation());
            productSpecification1.setAtBaseType(productSpecification.getAtBaseType());
            return new ResponseEntity<>(productSpecificationRepository.save(productSpecification1), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String deleteProductSpecification(@PathVariable String id){
        productSpecificationRepository.deleteById(id);

        return "Deleted Successfully";
    }
}
