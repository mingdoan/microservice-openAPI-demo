package com.example.productorderingservice.api;

import com.example.productorderingservice.models.ProductOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@Slf4j
public class ProductOrderClient {
    private final ProductOrderApi productOrderApi;

    public ProductOrderClient(ProductOrderApi productOrderApi) {
        this.productOrderApi = productOrderApi;
    }


//    public ProductOrderClient(ProductOrderApi ProductOrderApi) {
//        this.ProductOrderApi = ProductOrderApi;
//    }

//    public ResponseEntity<List<ProductOrder>> listProductOrder() {
//        try {
//
//            return productOrderApi.listProductOrder("", 2,2);
//        } catch (Exception e) {
//            log.error("Find all failed: {}", e.getLocalizedMessage());
//            ResponseEntity<List<ProductOrder>> listResponseEntity = new
//                    ResponseEntity<List<ProductOrder>>; return listResponseEntity;
//        }
//    }

    public ResponseEntity<ProductOrder> retrieveProductOrder(String id , String fields){
        try {

            return productOrderApi.retrieveProductOrder(id, fields);
        } catch (Exception e) {
            log.error("Find all failed: {}", e.getLocalizedMessage());
            return null;
        }
    }
}
