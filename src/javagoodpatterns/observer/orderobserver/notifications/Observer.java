package javagoodpatterns.observer.orderobserver.notifications;

import javagoodpatterns.observer.orderobserver.order.Order;

public interface Observer {
    void update(Order order);
}
