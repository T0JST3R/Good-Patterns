package javagoodpatterns.observer.orderobserver.notifications;

import javagoodpatterns.observer.orderobserver.order.Order;

public class MobileApp implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("MOBILE APP - Hey! your order number: " + order.getOrderNumber() + "has changed its status! now it's " + order.getOrderStatus() + "best regards :)");
    }
}
