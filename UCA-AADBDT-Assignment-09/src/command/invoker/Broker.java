package command.invoker;

import command.commands.Order;
import command.request.Stock;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private static List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
