package com.fooddeliveryapplicationscalable.delivery.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.fooddeliveryapplicationscalable.delivery.model.DeliveryItem;

import java.util.List;
import java.util.UUID;

@Repository
public interface DeliveryItemRepository extends MongoRepository<DeliveryItem, UUID>{
    /**
     * To find deliveries by delivery person
     */
    @Query("{deliveryPersonnelId : ?0}")
    List<DeliveryItem> findByDeliveryPersonnelId(UUID deliveryPersonnelId); 

    
}