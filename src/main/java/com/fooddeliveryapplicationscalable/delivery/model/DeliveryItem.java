package com.fooddeliveryapplicationscalable.delivery.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DeliveryItem {
    @Id
    private String deliveryId;
    @JsonProperty(value = "orderId")
    private String orderId;
    @JsonProperty(value = "deliveryPersonnelId")
    private String deliveryPersonnelId;
    @JsonProperty(value = "deliveryStatus")
    private DeliveryStatus deliveryStatus;
    @JsonProperty(value = "estimatedDeliveryTime")
    private LocalDateTime estimatedDeliveryTime;
    @JsonProperty(value = "actualDeliveryTime")
    private LocalDateTime actualDeliveryTime;
    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    public String getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getDeliveryPersonnelId() {
        return deliveryPersonnelId;
    }
    public void setDeliveryPersonnelId(String deliveryPersonnelId) {
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