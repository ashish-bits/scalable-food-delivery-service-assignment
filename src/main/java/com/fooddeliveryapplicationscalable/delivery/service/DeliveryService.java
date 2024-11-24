package com.fooddeliveryapplicationscalable.delivery.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fooddeliveryapplicationscalable.delivery.model.DeliveryItem;
import com.fooddeliveryapplicationscalable.delivery.model.DeliveryStatus;
import com.fooddeliveryapplicationscalable.delivery.repository.DeliveryItemRepository;

@Service
public class DeliveryService {
    @Autowired
    private DeliveryItemRepository deliveryItemRepository;

    public DeliveryItem createDeliveryItem(DeliveryItem deliveryItem) {
        return deliveryItemRepository.save(deliveryItem);
    }

    public List<DeliveryItem> getDeliveriesByDeliveryPerson(UUID deliveryPersonId) {
        return deliveryItemRepository.findByDeliveryPersonnelId(deliveryPersonId);
    }

    public DeliveryItem findById(UUID deliveryId) {
        return deliveryItemRepository.findById(deliveryId).orElse(null);
    }

    public DeliveryItem updateDeliveryStatus(UUID deliveryId, DeliveryStatus deliveryStatus) {
        DeliveryItem deliveryItem = findById(deliveryId);
        if(deliveryItem != null) {
            deliveryItem.setDeliveryStatus(deliveryStatus);
            return deliveryItemRepository.save(deliveryItem);
        }
        //Handle error cases appropriately
        return null;
    }

    public DeliveryItem deleteDeliveryItem(UUID deliveryId) {
        DeliveryItem deliveryItem = findById(deliveryId);
        if(deliveryItem!= null) {
            deliveryItemRepository.deleteById(deliveryId);
            return deliveryItem;
        }
        return null;
    }
}
