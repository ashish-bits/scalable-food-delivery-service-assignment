package com.fooddeliveryapplicationscalable.delivery.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DeliveryItem {
    @Id
    private UUID deliveryId;
    @JsonProperty(value = "orderId")
    private UUID orderId;
    @JsonProperty(value = "deliveryPersonnelId")
    private UUID deliveryPersonnelId;
    @JsonProperty(value = "deliveryStatus")
    private DeliveryStatus deliveryStatus;
    @JsonProperty(value = "estimatedDeliveryTime")
    private LocalDateTime estimatedDeliveryTime;
    @JsonProperty(value = "actualDeliveryTime")
    private LocalDateTime actualDeliveryTime;
    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    public UUID getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(UUID deliveryId) {
        this.deliveryId = deliveryId;
    }
    public UUID getOrderId() {
        return orderId;
    }
    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }
    public UUID getDeliveryPersonnelId() {
        return deliveryPersonnelId;
    }
    public void setDeliveryPersonnelId(UUID deliveryPersonnelId) {
        this.deliveryPersonnelId = deliveryPersonnelId;
    }
    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }
    public LocalDateTime getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }
    public void setEstimatedDeliveryTime(LocalDateTime estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }
    public LocalDateTime getActualDeliveryTime() {
        return actualDeliveryTime;
    }
    public void setActualDeliveryTime(LocalDateTime actualDeliveryTime) {
        this.actualDeliveryTime = actualDeliveryTime;
    }   
    
}