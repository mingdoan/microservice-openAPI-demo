package com.example.productcatalogservice.controllers;

import com.example.productcatalogservice.models.ExportJob;
import com.example.productcatalogservice.repositories.ExportJobRepository;
import com.example.productcatalogservice.services.ExportJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tmf-api/productCatalogManagement/v4/exportJob")
public class ExportJobController {
    @Autowired
    private ExportJobService exportJobService;
    @Autowired
    private ExportJobRepository exportJobRepository;

    @GetMapping
    public List<ExportJob> getAll() {
        return exportJobService.getAll();
    }


    @PostMapping
    public ResponseEntity<ExportJob> save(@RequestBody ExportJob exportJob) {
        ExportJob savedExportJob = exportJobService.save(exportJob);
        return ResponseEntity.ok().body(savedExportJob);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ExportJob> patchExportJob(@PathVariable("id") String id, @RequestBody ExportJob exportJob) {
        Optional<ExportJob> exportJobData = exportJobRepository.findById(id);
        if (exportJobData.isPresent()) {
            ExportJob exportJob1 = exportJobData.get();
            exportJob1.setAtSchemaLocation(exportJob.getAtSchemaLocation());
            exportJob1.setAtBaseType(exportJob.getAtBaseType());
            return new ResponseEntity<>(exportJobRepository.save(exportJob1), HttpStatus.OK);
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
    public String deleteExportJob(@PathVariable String id){
        exportJobRepository.deleteById(id);

        return "Deleted Successfully";
    }
}
