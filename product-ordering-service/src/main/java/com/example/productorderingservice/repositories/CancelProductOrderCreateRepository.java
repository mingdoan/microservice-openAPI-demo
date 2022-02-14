package com.example.productorderingservice.repositories;

import com.example.productorderingservice.models.CancelProductOrderCreate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CancelProductOrderCreateRepository extends MongoRepository<CancelProductOrderCreate,String> {
}
