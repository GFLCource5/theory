package com.example.facade.model;

import java.time.LocalDateTime;

public class Notification {
    private String status;
    private LocalDateTime deliveryDate;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notification that)) return false;
        if (getStatus() != null ? !getStatus().equals(that.getStatus()) : that.getStatus() != null) return false;
        return getDeliveryDate() != null ? getDeliveryDate().equals(that.getDeliveryDate()) : that.getDeliveryDate() == null;
    }

    @Override
    public int hashCode() {
        int result = getStatus() != null ? getStatus().hashCode() : 0;
        result = 31 * result + (getDeliveryDate() != null ? getDeliveryDate().hashCode() : 0);
        return result;
    }
}
