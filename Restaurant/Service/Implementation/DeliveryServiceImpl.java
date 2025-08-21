package EraSoftTask.Restaurant.Service.Implementation;

import EraSoftTask.Restaurant.Data.OrderData;
import EraSoftTask.Restaurant.Model.Order;
import EraSoftTask.Restaurant.Model.OrderStatus;
import EraSoftTask.Restaurant.Service.Interfaces.DeliveryService;

public class DeliveryServiceImpl implements DeliveryService {

    @Override
    public void updateOrderStatue(int orderID, OrderStatus orderStatus) {
        for (Order order : OrderData.order) {
            if (order.getOrderID() == orderID) {
                order.setOrderStatue(orderStatus);
                System.out.println("Statue updated.");
                return;
            }
        }
        System.out.println("Invalid Order");
    }

    @Override
    public void viewOrders() {
        for (Order order : OrderData.order) {
            if (order.getOrderStatus() == OrderStatus.READY_FOR_DELIVERY) {
                System.out.println(order);
            }
        }
    }
}