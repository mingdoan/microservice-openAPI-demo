package com.example.productcatalogservice.services.impl;

import com.example.productcatalogservice.models.Catalog;
import com.example.productcatalogservice.repositories.CatalogRepository;
import com.example.productcatalogservice.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private CatalogRepository repository;

    @Override
    public List<Catalog> getAll() {
        return repository.findAll();
    }

    @Override
    public Catalog save(Catalog catalog) {
        return repository.save(catalog);
    }

}
