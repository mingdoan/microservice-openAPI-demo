package com.example.productcatalogservice.services;

import com.example.productcatalogservice.models.Category;
import com.example.productcatalogservice.models.ExportJob;

import java.util.List;

public interface ExportJobService {
    List<ExportJob> getAll();
    ExportJob save(ExportJob exportJob);
}
