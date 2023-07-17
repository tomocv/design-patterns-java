package command;

import command.commands.BuyStock;
import command.commands.SellStock;
import command.invoker.Broker;
import command.request.Stock;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Broker broker = new Broker();

        broker.takeOrder(new BuyStock(new Stock("Apple", 500)));
        broker.takeOrder(new SellStock(new Stock("Tesla", 200)));
        broker.takeOrder(new BuyStock(new Stock("Google", 50)));

        broker.placeOrders();
    }
}
