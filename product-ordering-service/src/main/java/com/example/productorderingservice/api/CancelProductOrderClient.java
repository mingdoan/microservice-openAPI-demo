//package com.example.productorderingservice.api;
//
//import com.example.productorderingservice.models.CancelProductOrder;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//@Component
//@Slf4j
//public class CancelProductOrderClient {
//    private final CancelProductOrderApi cancelProductOrderApi;
//
//
//    public CancelProductOrderClient(CancelProductOrderApi CancelProductOrderApi) {
//        this.cancelProductOrderApi = CancelProductOrderApi;
//    }
//
//    public List<CancelProductOrder> listCancelProductOrder() {
//        try {
//
//            return cancelProductOrderApi.listCancelProductOrder("", 2,2);
//        } catch (Exception e) {
//            log.error("Find all failed: {}", e.getLocalizedMessage());
//            return new ArrayList<>();
//        }
//    }
//
//    public CancelProductOrder retrieveCancelProductOrder(String id , String fields){
//        try {
//
//            return cancelProductOrderApi.retrieveCancelProductOrder(id, fields);
//        } catch (Exception e) {
//            log.error("Find all failed: {}", e.getLocalizedMessage());
//            return null;
//        }
//    }
//}
