package com.example.productcatalogservice.services;

import com.example.productcatalogservice.models.Catalog;

import java.util.List;

public interface CatalogService {
    List<Catalog> getAll();
    Catalog save(Catalog catalog);
}
