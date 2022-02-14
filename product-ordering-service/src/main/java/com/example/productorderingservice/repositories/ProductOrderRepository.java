package com.example.productorderingservice.repositories;

import com.example.productorderingservice.models.ProductOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductOrderRepository extends MongoRepository <ProductOrder,String> {
}
