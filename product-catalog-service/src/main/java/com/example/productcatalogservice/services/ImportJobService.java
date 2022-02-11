package com.example.productcatalogservice.services;

import com.example.productcatalogservice.models.ImportJob;

import java.util.List;

public interface ImportJobService {
    List<ImportJob> getAll();
    ImportJob save(ImportJob importJob);
}
