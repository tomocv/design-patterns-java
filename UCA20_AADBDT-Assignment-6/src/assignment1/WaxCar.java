package assignment1;

public class WaxCar implements CarService{
    private CarWash carWash;

    public WaxCar(CarWash carWash) {
        this.carWash = carWash;
    }

    @Override
    public void doService() {
        carWash.doService();
        System.out.println("Adding wax...");
    }
}
