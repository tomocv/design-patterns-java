package fluent_builder.builder;

import common.models.*;

public class McFluentBuilder {
    protected Meal meal = new Meal();

    public McFluentBuilder setName(MealName mealName) {
        meal.mealName = mealName;
        return this;
    }

    public McFluentBuilder addMainDish(MainDish mainDish) {
        meal.mainDish = mainDish;
        return this;
    }

    public McFluentBuilder addSideDish(SideDish sideDish) {
        meal.sideDish = sideDish;
        return this;
    }

    public McFluentBuilder addDrink(Drink drink) {
        meal.drink = drink;
        return this;
    }

    public McFluentBuilder addDressing(Dressing dressing) {
        meal.dressing = dressing;
        return this;
    }

    public McFluentBuilder addBonusItems(BonusItems bonusItems) {
        meal.bonusItems = bonusItems;
        return this;
    }

    public Meal build() {
        return meal;
    }

    @Override
    public String toString() {
        return meal.toString();
    }
}
