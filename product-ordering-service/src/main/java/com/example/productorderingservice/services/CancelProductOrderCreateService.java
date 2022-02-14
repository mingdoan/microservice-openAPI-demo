package com.example.productorderingservice.services;

import com.example.productorderingservice.models.CancelProductOrder;
import com.example.productorderingservice.models.CancelProductOrderCreate;

public interface CancelProductOrderCreateService {
    CancelProductOrderCreate createCancelProductOrder(CancelProductOrderCreate cancelProductOrder);
}
