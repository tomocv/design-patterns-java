package assignment1;

public class InsideCleanup implements CarService {
    private CarService carService;

    public InsideCleanup(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void doService() {
        carService.doService();
        System.out.println("Cleaning car interior...");
    }
}
