package com.fooddeliveryapplicationscalable.delivery.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryStatusUpdateRequest {

    @JsonProperty(value = "deliveryStatus")
    private DeliveryStatus deliveryStatus;
    
    public DeliveryStatus getDeliveryStatus() {
            return deliveryStatus;
    }
    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
