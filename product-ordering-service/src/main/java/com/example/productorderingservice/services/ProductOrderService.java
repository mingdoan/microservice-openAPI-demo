package com.example.productorderingservice.services;

import com.example.productorderingservice.api.ProductOrderApiDelegate;
import com.example.productorderingservice.api.ProductOrderClient;
import com.example.productorderingservice.models.ProductOrder;
import com.example.productorderingservice.models.ProductOrderCreate;
import com.example.productorderingservice.models.ProductOrderStateType;
import com.example.productorderingservice.repositories.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class ProductOrderService implements ProductOrderApiDelegate {
    @Autowired
    ProductOrderRepository productOrderRepository;

    @Autowired
    ProductOrderClient productOrderClient;

    @Override
    public ResponseEntity<ProductOrder> createProductOrder(ProductOrderCreate productOrder) {


        long count = productOrder.getProductOrderItem()
                .stream()
                .filter(el -> productOrderClient.retrieveProductOrder(el.getProductOffering().getId(), "none") != null)
                .count();

        ProductOrder order = toEntity(productOrder);
        if (count > 0) {

            order.setState(ProductOrderStateType.REJECTED);
            return new ResponseEntity<>(productOrderRepository.save(order), HttpStatus.resolve(422));
        }
        order.setState(ProductOrderStateType.ACKNOWLEDGED);

        return new ResponseEntity<>(productOrderRepository.save(order), HttpStatus.resolve(201));
    }

//    @Override
//    public ResponseEntity<List<ProductOrder>> listProductOrder(Optional<String> fields,
//                                                               Optional<Integer> offset,
//                                                               Optional<Integer> limit) {
//
//        return ResponseEntity.ok(productOrderRepository.findAll());
//    }

    public ProductOrder toEntity(ProductOrderCreate productOrderCreate) {
        ProductOrder order = new ProductOrder();
        order.setExternalId(productOrderCreate.getExternalId());
        order.setAgreement(productOrderCreate.getAgreement());
        order.setAtBaseType(productOrderCreate.getAtBaseType());
        order.setBillingAccount(productOrderCreate.getBillingAccount());
        order.setCategory(productOrderCreate.getCategory());
        order.setExternalId(productOrderCreate.getExternalId());
        order.setProductOrderItem(productOrderCreate.getProductOrderItem());
        order.setAtType(productOrderCreate.getAtType());

        return order;
    }
}
