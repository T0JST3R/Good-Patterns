package javagoodpatterns.observer.orderobserver.order;

import javagoodpatterns.observer.orderobserver.notifications.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {
    private OrderStatus orderStatus;
    private Long orderNumber;
    private Set<Observer> observers =  new HashSet<>();

    private void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override

    public void registerObservator(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObservator(Observer observer) {
observers.remove(observer);
    }

    @Override
    public void notifyObservators() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }
    public void changeOrderStatus (OrderStatus orderStatus){
        setOrderStatus(orderStatus);
        notifyObservators();
    }

    public Order(OrderStatus orderStatus, Long orderNumber) {
        this.orderStatus = orderStatus;
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public Set<Observer> getObservers() {
        return observers;
    }
}
