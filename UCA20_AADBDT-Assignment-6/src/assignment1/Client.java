package assignment1;


// Composite
public class Client {
    public static void main(String[] args) {
        var carService = new InsideCleanup(new WaxCar(new CarWash(new ChangeTiers(new BasicCarCheckup()))));
        carService.doService();
    }
}
