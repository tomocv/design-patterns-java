package fluent_builder.builder;

import common.models.*;

public class FluentBuilderClient {
    public static void main(String[] args) {
        var happyMeal = new McFluentBuilder();
        happyMeal.setName(MealName.HAPPY_MEAL)
                .addMainDish(MainDish.HAMBURGER)
                .addSideDish(SideDish.SMALL_FRIES)
                .addDrink(Drink.ORANGE_JUICE)
                .addBonusItems(BonusItems.TOY)
                .build();
        System.out.println(happyMeal);

        var crispySalad = new McFluentBuilder();
        crispySalad.setName(MealName.CRISPY_SALAD)
                .addMainDish(MainDish.CRISPY_CHICKEN_SALAD)
                .addDressing(Dressing.YOGURT)
                .addBonusItems(BonusItems.KNIFE_AND_FORK)
                .build();
        System.out.println(crispySalad);

        var bigMac = new McFluentBuilder();
        bigMac.setName(MealName.BIG_MAC_MENU)
                .addMainDish(MainDish.BIG_MAC)
                .addSideDish(SideDish.LARGE_FRIES)
                .addDrink(Drink.COKE)
                .build();
        System.out.println(bigMac);
    }
}
