package assignment1;

public class ChangeTiers implements CarService {
    private CarService carService;

    public ChangeTiers(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void doService() {
        carService.doService();
        System.out.println("Changing tiers...");
    }
}
