package com.example.productcatalogservice.services.impl;

import com.example.productcatalogservice.models.ImportJob;
import com.example.productcatalogservice.repositories.ImportJobRepository;
import com.example.productcatalogservice.services.ImportJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImportJobServiceImpl implements ImportJobService {
    @Autowired
    private ImportJobRepository repository;

    @Override
    public List<ImportJob> getAll() {
        return repository.findAll();
    }

    @Override
    public ImportJob save(ImportJob importJob) {
        return repository.save(importJob);
    }
}
