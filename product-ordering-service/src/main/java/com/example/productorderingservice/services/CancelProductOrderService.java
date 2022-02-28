package com.example.productorderingservice.services;

import com.example.productorderingservice.models.CancelProductOrder;

import java.util.List;
import java.util.Optional;

public interface CancelProductOrderService {
    List<CancelProductOrder> getAll();
    Optional <CancelProductOrder> getCancelProductOrderbyId(String id);
//    CancelProductOrder createCancelProductOrder(CancelProductOrder cancelProductOrder);

}
