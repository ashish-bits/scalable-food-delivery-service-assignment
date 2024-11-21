package com.fooddeliveryapplicationscalable.delivery.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fooddeliveryapplicationscalable.delivery.model.DeliveryItem;
import com.fooddeliveryapplicationscalable.delivery.model.DeliveryStatusUpdateRequest;
import com.fooddeliveryapplicationscalable.delivery.service.DeliveryService;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {
    
    @Autowired
    private DeliveryService deliveryService;

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<DeliveryItem> assignDelivery(@RequestBody DeliveryItem deliveryItem) {
        return new ResponseEntity<>(deliveryService.createDeliveryItem(deliveryItem), HttpStatus.CREATED);
    }
    @GetMapping("/{deliveryId}")
    @ResponseBody
    public ResponseEntity<DeliveryItem> getDeliveryDetails(@PathVariable String deliveryId) {
        return new ResponseEntity<>(deliveryService.findById(UUID.fromString(deliveryId)), HttpStatus.OK);
    }
    @PutMapping("/{deliveryId}/status")
    public DeliveryItem updateDeliveryStatus(@PathVariable String deliveryId, @RequestBody DeliveryStatusUpdateRequest request) {
        return deliveryService.updateDeliveryStatus(UUID.fromString(deliveryId), request.getDeliveryStatus());
        
    }
    @GetMapping("/delivery-personnel/{deliveryPersonnelId}")
    public List<DeliveryItem> getDeliveriesByPersonnelId(@PathVariable String deliveryPersonnelId) {
        return deliveryService.getDeliveriesByDeliveryPerson(UUID.fromString(deliveryPersonnelId));
    }

}
