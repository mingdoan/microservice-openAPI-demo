//package com.example.productorderingservice.services;
//
//import com.example.productorderingservice.api.CancelProductOrderClient;
//import com.example.productorderingservice.models.CancelProductOrder;
//import com.example.productorderingservice.models.CancelProductOrderCreate;
//import com.example.productorderingservice.models.ProductOrderRef;
//import com.example.productorderingservice.repositories.CancelProductOrderRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//@Service
//@Slf4j
//public interface CancelProductOrderService implements CancelProductOrderApiDelegate{
//   // CancelProductOrder save(CancelProductOrder cancelProductOrder);
// //   CancelProductOrder createCancelProductOrder(CancelProductOrder cancelProductOrder);
//   @Autowired
//   CancelProductOrderRepository cancelProductOrderRepository;
//
//    @Autowired
//    CancelProductOrderClient cancelProductOrderClient;
//
//    @Override
//    public ResponseEntity<CancelProductOrder> createCancelProductOrder(CancelProductOrderCreate cancelProductOrder){
//
//
////        long count = cancelProductOrder.getProductOrder()
////                .stream()
////                .filter(el -> CancelProductOrderClient.retrieveCancelProductOrder(el.getCancelProductOrder().getId(), "none") != null)
////                .count();
//
//        ProductOrderRef order = toEntity(productOrderref);
//        if (count > 0) {
//
//            order.setState(ProductOrderStateType.REJECTED);
//            return new ResponseEntity<>(productOrderRepository.save(order), HttpStatus.resolve(422));
//        }
//        order.setState(ProductOrderStateType.ACKNOWLEDGED);
//
//        return new ResponseEntity<>(productOrderRepository.save(order), HttpStatus.resolve(201));
//    }
//
//    @Override
//    public ResponseEntity<List<ProductOrder>> listProductOrder(Optional<String> fields,
//                                                               Optional<Integer> offset,
//                                                               Optional<Integer> limit) {
//
//        return ResponseEntity.ok(productOrderRepository.findAll());
//    }
//
//    public ProductOrder toEntity(ProductOrderCreate productOrderCreate) {
//        ProductOrder order = new ProductOrder();
//        order.setExternalId(productOrderCreate.getExternalId());
//        order.setAgreement(productOrderCreate.getAgreement());
//        order.setAtBaseType(productOrderCreate.getAtBaseType());
//        order.setBillingAccount(productOrderCreate.getBillingAccount());
//        order.setCategory(productOrderCreate.getCategory());
//        order.setExternalId(productOrderCreate.getExternalId());
//        order.setProductOrderItem(productOrderCreate.getProductOrderItem());
//        order.setAtType(productOrderCreate.getAtType());
//
//        return order;
//    }
//}
