package Facade.model;

import java.util.Objects;

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
        if (o == null || getClass() != o.getClass()) return false;
        MessageBox that = (MessageBox) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type, that.type) &&
                Objects.equals(from, that.from) &&
                Objects.equals(to, that.to) &&
                Objects.equals(packageBox, that.packageBox) &&
                Objects.equals(delivery, that.delivery) &&
                Objects.equals(notification, that.notification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, from, to, packageBox, delivery, notification);
    }

    @Override
    public String toString() {
        return "MessageBox{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", packageBox=" + packageBox +
                ", delivery=" + delivery +
                ", notification=" + notification +
                '}';
    }
}
