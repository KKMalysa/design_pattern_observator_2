package Order;

import Notification.Observer;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order implements Observable{

    private Set<Observer> registeredObservers = new HashSet<Observer>();

    private Long orderNumber;
    private OrderPriory orderPriory;
    private OrderStatus orderStatus;


    public Order(Long orderNumber, OrderPriory orderPriory, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderPriory = orderPriory;
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerObservator(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObservator(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers){
            observer.updateOrder(this);
        }
    }

    public Set<Observer> getRegisteredObservers() {
        return registeredObservers;
    }

    public void setRegisteredObservers(Set<Observer> registeredObservers) {
        this.registeredObservers = registeredObservers;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderPriory getOrderPriory() {
        return orderPriory;
    }

    public void setOrderPriory(OrderPriory orderPriory) {
        this.orderPriory = orderPriory;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }


}
