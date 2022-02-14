//package com.example.productorderingservice.services.impl;
//
//import com.example.productorderingservice.models.CancelProductOrder;
//import com.example.productorderingservice.models.CancelProductOrderCreate;
//import com.example.productorderingservice.repositories.CancelProductOrderCreateRepository;
//import com.example.productorderingservice.services.CancelProductOrderCreateService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//@Service
//public class CancelProductOrderCreateServiceImpl implements CancelProductOrderCreateService {
//    @Autowired
//    private CancelProductOrderCreateRepository repository;
//    @Override
//    @Transactional
//    public CancelProductOrderCreate cancelProductOrderCreate(CancelProductOrderCreate cancelProductOrderCreate) {
//        return repository.save(cancelProductOrderCreate);
//    }
//}
