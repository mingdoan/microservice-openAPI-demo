package com.example.productcatalogservice.controllers;

import com.example.productcatalogservice.models.ProductOfferingPrice;
import com.example.productcatalogservice.repositories.ProductOfferingPriceRepository;
import com.example.productcatalogservice.services.ProductOfferingPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/productOfferingPrice")
public class ProductOfferingPriceController {
    @Autowired
    private ProductOfferingPriceService productOfferingPriceService;
    @Autowired
    private ProductOfferingPriceRepository productOfferingPriceRepository;

    @GetMapping
    public List<ProductOfferingPrice> getAll() {
        return productOfferingPriceService.getAll();
    }


    @PostMapping
    public ResponseEntity<ProductOfferingPrice> save(@RequestBody ProductOfferingPrice productOfferingPrice) {
        ProductOfferingPrice savedProductOfferingPrice = productOfferingPriceService.save(productOfferingPrice);
        return ResponseEntity.ok().body(savedProductOfferingPrice);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProductOfferingPrice> patchProductOfferingPrice(@PathVariable("id") String id, @RequestBody ProductOfferingPrice productOfferingPrice) {
        Optional<ProductOfferingPrice> productOfferingPriceData = productOfferingPriceRepository.findById(id);
        if (productOfferingPriceData.isPresent()) {
            ProductOfferingPrice productOfferingPrice1 = productOfferingPriceData.get();
            productOfferingPrice1.setAtSchemaLocation(productOfferingPrice.getAtSchemaLocation());
            productOfferingPrice1.setAtBaseType(productOfferingPrice.getAtBaseType());
            return new ResponseEntity<>(productOfferingPriceRepository.save(productOfferingPrice1), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String deleteProductOfferingPrice(@PathVariable String id){
        productOfferingPriceRepository.deleteById(id);

        return "Deleted Successfully";
    }
}
