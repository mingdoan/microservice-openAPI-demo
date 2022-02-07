package com.example.productcatalogservice.repositories;

import com.example.productcatalogservice.models.Catalog;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CatalogQueryDao {
    List<Catalog> getAll();

}
