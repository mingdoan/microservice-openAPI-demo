package com.example.productcatalogservice.services.impl;

import com.example.productcatalogservice.models.Category;
import com.example.productcatalogservice.models.ExportJob;
import com.example.productcatalogservice.repositories.CategoryRepository;
import com.example.productcatalogservice.repositories.ExportJobRepository;
import com.example.productcatalogservice.services.ExportJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExportJobServiceImpl implements ExportJobService {
    @Autowired
    private ExportJobRepository repository;

    @Override
    public List<ExportJob> getAll() {
        return repository.findAll();
    }

    @Override
    public ExportJob save(ExportJob exportJob) {
        return repository.save(exportJob);
    }
}
