package assignment1;

public class CarWash implements CarService{
    private CarService carService;

    public CarWash(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void doService() {
        carService.doService();
        System.out.println("Washing car...");
    }
}
