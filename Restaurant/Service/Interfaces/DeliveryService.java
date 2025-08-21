package EraSoftTask.Restaurant.Service.Interfaces;

import EraSoftTask.Restaurant.Model.OrderStatus;

public interface DeliveryService {

    void viewOrders();

    void updateOrderStatue(int orderID, OrderStatus orderStatue);
}