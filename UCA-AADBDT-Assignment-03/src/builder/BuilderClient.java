package builder;


import builder.builders.McBuilder;
import builder.director.Director;
import common.models.Meal;

// Client
public class BuilderClient {
    public static void main(String[] args) {
        var director = new Director();
        var happyMealBuilder = new McBuilder();
        director.buildHappyMeal(happyMealBuilder);
        Meal happyMeal = happyMealBuilder.buildMeal();
        System.out.println(happyMeal);

        var crispySaladBuilder = new McBuilder();
        director.buildCrispySalad(crispySaladBuilder);
        Meal crispySalad = crispySaladBuilder.buildMeal();
        System.out.println(crispySalad);

        var bigMacBuilder = new McBuilder();
        director.buildBigMac(bigMacBuilder);
        Meal bigMac = bigMacBuilder.buildMeal();
        System.out.println(bigMac);
    }
}
