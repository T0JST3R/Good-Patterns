package javagoodpatterns.observer.orderobserver.notifications;

import javagoodpatterns.observer.orderobserver.order.Order;

public class Email implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("EMAIL -  Hey! your order number: " + order.getOrderNumber() + "has changed its status! now it's " + order.getOrderStatus() + "best regards :)");
    }
}
