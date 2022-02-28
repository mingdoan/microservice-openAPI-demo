package com.example.productorderingservice.controllers;

import com.example.productorderingservice.models.CancelProductOrder;
import com.example.productorderingservice.models.CancelProductOrderCreate;
import com.example.productorderingservice.repositories.CancelProductOrderRepository;
import com.example.productorderingservice.services.CancelProductOrderCreateService;
import com.example.productorderingservice.services.CancelProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tmf-api/productOrderingManagement/v4/cancelProductOrder")
public class CancelProductOrderController {
    @Autowired
    private CancelProductOrderService cancelProductOrderService;
    @Autowired
    private CancelProductOrderCreateService cancelProductOrderCreateService;


    @GetMapping
    public List<CancelProductOrder> getAll() {
        return cancelProductOrderService.getAll();
    }


    @PostMapping
    public ResponseEntity<CancelProductOrderCreate> save(CancelProductOrderCreate cancelProductOrder) {
        CancelProductOrderCreate savedCancelProductOrderCreate = cancelProductOrderCreateService.createCancelProductOrder(cancelProductOrder);
        return ResponseEntity.ok().body(savedCancelProductOrderCreate);
    }



    @GetMapping("/{id}")
    public String getCancelProductOrderById(@PathVariable String id){
        cancelProductOrderService.getCancelProductOrderbyId(id);
        return "Found Cancel Product Successfully";
    }

}
