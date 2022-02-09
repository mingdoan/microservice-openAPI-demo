package com.example.productcatalogservice.services.impl;

import com.example.productcatalogservice.models.Catalog;
import com.example.productcatalogservice.repositories.CatalogQueryDao;
import com.example.productcatalogservice.services.CatalogQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogQueryServiceImpl implements CatalogQueryService {
    @Autowired
    private CatalogQueryDao catalogQueryDao;

    @Override
    public List<Catalog> getAll() {
        System.out.println("Inside Employee Query Service Impl");
        return catalogQueryDao.getAll();
    }
}
