package com.example.productcatalogservice.services;

import com.example.productcatalogservice.models.Catalog;

import java.util.List;

public interface CatalogQueryService {
    List<Catalog> getAll();
}
