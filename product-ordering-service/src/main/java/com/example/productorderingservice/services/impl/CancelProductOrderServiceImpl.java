package com.example.productorderingservice.services.impl;

import com.example.productorderingservice.models.CancelProductOrder;
import com.example.productorderingservice.repositories.CancelProductOrderRepository;
import com.example.productorderingservice.services.CancelProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CancelProductOrderServiceImpl implements CancelProductOrderService {
    @Autowired
    private CancelProductOrderRepository repository;

    @Override
    public List<CancelProductOrder> getAll() {
        return repository.findAll();
    }
    @Override
    public Optional <CancelProductOrder> getCancelProductOrderbyId(String id) {
        return repository.findById(id);
    }
//    @Override
//    public CancelProductOrder save(CancelProductOrder cancelProductOrder) {
//        return repository.save(cancelProductOrder);
//    }
}