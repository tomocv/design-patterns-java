package assignment1;

public class BasicCarCheckup implements CarService{

    public BasicCarCheckup() {
    }

    @Override
    public void doService() {
        System.out.println("Doing basic check-up...");
    }
}
