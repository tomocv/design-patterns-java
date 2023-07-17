import Implementations.AdapterGbToEuSocket;
import Implementations.StandardEuSocket;
import Implementations.StandardGbSocket;
import Model.Charger;
import Model.Laptop;

public class Demo {
    public static void main(String[] args) {
        Charger charger = new Charger();
        Laptop laptop = new Laptop("Dell");

        charger.charge(laptop, new StandardEuSocket());
        charger.charge(laptop, new AdapterGbToEuSocket(new StandardGbSocket()));



    }
}
