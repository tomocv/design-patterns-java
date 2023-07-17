package Model;

import Implementations.EuSocket;

public class Charger {
    public void charge(Laptop laptop, EuSocket euSocket) {
        System.out.println("Charging laptop "
                + laptop.getName()
                + " with "
                + euSocket.giveEuCurrent()
        );
    }
}
