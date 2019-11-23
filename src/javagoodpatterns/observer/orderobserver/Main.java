package javagoodpatterns.observer.orderobserver;

import javagoodpatterns.observer.orderobserver.notifications.Email;
import javagoodpatterns.observer.orderobserver.notifications.MobileApp;
import javagoodpatterns.observer.orderobserver.notifications.Observer;
import javagoodpatterns.observer.orderobserver.notifications.TextMessage;
import javagoodpatterns.observer.orderobserver.order.Order;
import javagoodpatterns.observer.orderobserver.order.OrderStatus;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(OrderStatus.REGISTERED, 2492842L);
        Email email = new Email();
        MobileApp mobileApp = new MobileApp();
        TextMessage textMessage = new TextMessage();

        order.registerObservator(email);
        order.registerObservator(mobileApp);
        order.registerObservator(textMessage);

        order.notifyObservators();

        order.unregisterObservator(email);
        order.changeOrderStatus(OrderStatus.SENT);


    }
}
