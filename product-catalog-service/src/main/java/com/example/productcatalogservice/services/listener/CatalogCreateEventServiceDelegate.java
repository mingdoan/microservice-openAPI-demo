//package com.example.productcatalogservice.services.listener;
//
//import com.example.productcatalogservice.models.CatalogCreateEvent;
//import com.example.productcatalogservice.models.EventSubscription;
//import com.example.productcatalogservice.repositories.listener.CatalogCreateEventRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//public class CatalogCreateEventServiceDelegate {
//    @Autowired
//    private CatalogCreateEventRepository catalogCreateEventRepository;
//    @Override
//    public ResponseEntity<EventSubscription> listenToCatalogCreateEvent(CatalogCreateEvent catalogCreateEvent) {
//        EventSubscription savedCatalogCreateEvent = catalogCreateEventService.save(eventSubscription);
//        return new ResponseEntity<>(catalogCreateEventRepository.save(catalogCreateEvent), HttpStatus.resolve(201));
//    }
//}
