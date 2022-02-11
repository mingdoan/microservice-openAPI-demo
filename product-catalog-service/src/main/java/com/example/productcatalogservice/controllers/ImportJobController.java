package com.example.productcatalogservice.controllers;

import com.example.productcatalogservice.models.ExportJob;
import com.example.productcatalogservice.models.ImportJob;
import com.example.productcatalogservice.repositories.ExportJobRepository;
import com.example.productcatalogservice.repositories.ImportJobRepository;
import com.example.productcatalogservice.services.ExportJobService;
import com.example.productcatalogservice.services.ImportJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/importJob")
public class ImportJobController {
    @Autowired
    private ImportJobService importJobService;
    @Autowired
    private ImportJobRepository importJobRepository;

    @GetMapping
    public List<ImportJob> getAll() {
        return importJobService.getAll();
    }


    @PostMapping
    public ResponseEntity<ImportJob> save(@RequestBody ImportJob importJob) {
        ImportJob savedImportJob = importJobService.save(importJob);
        return ResponseEntity.ok().body(savedImportJob);
    }

    @DeleteMapping("/{id}")
    public String deleteImportJob(@PathVariable String id){
        importJobRepository.deleteById(id);

        return "Deleted Successfully";
    }
}
