package com.example.productcatalogservice.repositories.impl;

import com.example.productcatalogservice.models.Catalog;
import com.example.productcatalogservice.repositories.CatalogQueryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
public class CatalogQueryDaoImpl implements CatalogQueryDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Catalog> getAll() {
        System.out.println("Inside Employee Query DAO Impl's get()");
        return mongoTemplate.findAll(Catalog.class);
    }

}
