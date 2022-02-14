package com.example.productorderingservice.services.impl;

import com.example.productorderingservice.models.CancelProductOrder;
import com.example.productorderingservice.models.CancelProductOrderCreate;
import com.example.productorderingservice.repositories.CancelProductOrderCreateRepository;
import com.example.productorderingservice.repositories.CancelProductOrderRepository;
import com.example.productorderingservice.services.CancelProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CancelProductOrderServiceImpl implements CancelProductOrderService {
    @Autowired
    private CancelProductOrderRepository repository;
    @Autowired
    private CancelProductOrderCreateRepository repository1;

//    @Override
//    public List<CancelProductOrder> getAll() {
//        return repository.findAll();
//    }
//
//    @Override
//    public CancelProductOrder save(CancelProductOrder cancelProductOrder) {
//        return repository.save(cancelProductOrder);
//    }
    @Override
    @Transactional
    public CancelProductOrder createCancelProductOrder(CancelProductOrder cancelProductOrder) {
        return repository.save(cancelProductOrder);
    }
}
