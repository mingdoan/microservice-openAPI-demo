//package com.example.productorderingservice.api;
//
//import com.example.productorderingservice.models.CancelProductOrder;
//import com.example.productorderingservice.models.CancelProductOrderCreate;
//import com.example.productorderingservice.repositories.CancelProductOrderCreateRepository;
//import com.example.productorderingservice.repositories.CancelProductOrderRepository;
//import com.example.productorderingservice.services.impl.CancelProductOrderCreateServiceImpl;
//import com.example.productorderingservice.services.impl.CancelProductOrderServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//public class CancelProductOrderApiDelegateImpl implements CancelProductOrderApiDelegate{
//    private final CancelProductOrderServiceImpl cancelProductOrderService;
//    private final CancelProductOrderCreateServiceImpl cancelProductOrderCreateServiceImpl;
//    private final CancelProductOrderRepository cancelProductOrderRepository;
//    private final CancelProductOrderCreateRepository cancelProductOrderCreateRepository;
//
//    @Autowired
//    public void CancelProductOrdersApiDelegateImpl(CancelProductOrderServiceImpl cancelProductOrderService, CancelProductOrderRepository cancelProductOrderRepository) {
//      //  this.cancelProductOrderService = cancelProductOrderService;
//      //  this.cancelProductOrderRepository = cancelProductOrderRepository;
//    }
//    @Autowired
//    public CancelProductOrderApiDelegateImpl(CancelProductOrderServiceImpl cancelProductOrderService, CancelProductOrderRepository cancelProductOrderRepository, CancelProductOrderCreateRepository cancelProductOrderCreateRepository) {
//        this.cancelProductOrderService = cancelProductOrderService;
//        this.cancelProductOrderRepository = cancelProductOrderRepository;
//   //     this.cancelProductOrderCreateRepository = cancelProductOrderCreateRepository;
//    }
//
//    @Override
//    public ResponseEntity<CancelProductOrder> createCancelProductOrder(CancelProductOrderCreate cancelProductOrder) {
//        CancelProductOrder CancelProductOrder = cancelProductOrderCreateServiceImpl.createCancelProductOrder(cancelProductOrder);
//        return new ResponseEntity<>(cancelProductOrderRepository.save(CancelProductOrder), HttpStatus.CREATED);
//    }
//
//
//
//}
