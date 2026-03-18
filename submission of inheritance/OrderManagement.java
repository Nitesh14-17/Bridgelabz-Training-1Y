class Order {
    int orderId;
    String orderDate;
}

class ShippedOrder extends Order {
    String trackingNumber;
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    String getOrderStatus() {
        return "Delivered";
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder();
        d.orderId = 101;
        d.orderDate = "2026-03-18";
        d.trackingNumber = "TR123";
        d.deliveryDate = "2026-03-20";
        System.out.println(d.orderId + " " + d.orderDate + " " + d.trackingNumber + " " + d.deliveryDate + " " + d.getOrderStatus());
    }
}
