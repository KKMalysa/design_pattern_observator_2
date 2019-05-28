package Notification;

import Order.Order;

public class SalesRep implements Observer{

    @Override
    public void updateOrder(Order order) {
        System.out.println("Zamówienie nr: " + order.getOrderNumber() + " Priorytet: " + order.getOrderPriory() + " Obecny status:" + order.getOrderStatus() );
    }

}
