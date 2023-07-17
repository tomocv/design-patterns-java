package builder.director;

import builder.builders.MealBuilder;
import common.models.*;

public class Director {
    // factory method?!?
    public void buildCrispySalad (MealBuilder builder) {
        builder.setName(MealName.CRISPY_SALAD);
        builder.addMainDish(MainDish.CRISPY_CHICKEN_SALAD);
        builder.addDressing(Dressing.THOUSAND_ISLANDS);
        builder.addBonusItems(BonusItems.KNIFE_AND_FORK);
    }

    public void buildHappyMeal (MealBuilder builder) {
        builder.setName(MealName.HAPPY_MEAL);
        builder.addMainDish(MainDish.CHEESEBURGER);
        builder.addSideDish(SideDish.SMALL_FRIES);
        builder.addDrink(Drink.COKE);
        builder.addBonusItems(BonusItems.TOY);
    }

    public void buildBigMac (MealBuilder builder) {
        builder.setName(MealName.BIG_MAC_MENU);
        builder.addMainDish(MainDish.BIG_MAC);
        builder.addSideDish(SideDish.LARGE_FRIES);
        builder.addDrink(Drink.SPRITE);
    }
}
