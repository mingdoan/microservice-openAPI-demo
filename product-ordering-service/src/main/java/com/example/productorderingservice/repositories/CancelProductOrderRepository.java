package com.example.productorderingservice.repositories;

import com.example.productorderingservice.models.CancelProductOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CancelProductOrderRepository extends MongoRepository<CancelProductOrder,String> {
}
