package com.geeksforless.tuleninov.facade.model;

public class MessageBox {
    private String id;
    private String type;
    private String from;
    private String to;

    private PackageBox packageBox;
    private Delivery delivery;

    private Notification notification;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public PackageBox getPackageBox() {
        return packageBox;
    }

    public void setPackageBox(PackageBox packageBox) {
        this.packageBox = packageBox;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageBox)) return false;

        MessageBox that = (MessageBox) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) return false;
        if (getFrom() != null ? !getFrom().equals(that.getFrom()) : that.getFrom() != null) return false;
        if (getTo() != null ? !getTo().equals(that.getTo()) : that.getTo() != null) return false;
        if (getPackageBox() != null ? !getPackageBox().equals(that.getPackageBox()) : that.getPackageBox() != null)
            return false;
        return getDelivery() != null ? getDelivery().equals(that.getDelivery()) : that.getDelivery() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getFrom() != null ? getFrom().hashCode() : 0);
        result = 31 * result + (getTo() != null ? getTo().hashCode() : 0);
        result = 31 * result + (getPackageBox() != null ? getPackageBox().hashCode() : 0);
        result = 31 * result + (getDelivery() != null ? getDelivery().hashCode() : 0);
        return result;
    }
}
