//package com.example.productorderingservice.controllers;
//
//import com.example.productcatalogservice.api.CancelProductOrderApi;
//import com.example.productcatalogservice.models.CancelProductOrder;
//import com.example.productorderingservice.services.CancelProductOrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class CancelProductOrderController implements CancelProductOrderApi {
//    @Autowired
//    private CancelProductOrderService cancelProductOrderService;
//    @Override
//    public ResponseEntity<CancelProductOrder> createCancelProductOrder(){
//        CancelProductOrder savedCancelProductOrder = cancelProductOrderService.save(cancelProductOrder);
//        return ResponseEntity.ok().body(savedCancelProductOrder);
//    }
//
//}
