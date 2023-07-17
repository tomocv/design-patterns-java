package common.models;

import static common.utility.StringChecker.appendIfTrue;

public class Meal {
    public MealName mealName;
    public MainDish mainDish;
    public SideDish sideDish;
    public Drink drink;
    public Dressing dressing;
    public BonusItems bonusItems;

    public Meal(MealName mealName, MainDish mainDish, SideDish sideDish, Drink drink, Dressing dressing, BonusItems bonusItems) {
        this.mealName = mealName;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.drink = drink;
        this.dressing = dressing;
        this.bonusItems = bonusItems;
    }

    public Meal() {
    }

    @Override
    public String toString() {
        StringBuilder mealDescription = new StringBuilder();
        // calls StringCheckerUtility method to see if item exists
        mealDescription.append(mealName.toString().toUpperCase())
                .append("\n");
        mealDescription.append(appendIfTrue("Main Dish: ", mainDish));
        mealDescription.append(appendIfTrue("Side Dish: ", sideDish));
        mealDescription.append(appendIfTrue("Drink: ", drink));
        mealDescription.append(appendIfTrue("Dressing: ", dressing));
        mealDescription.append(appendIfTrue("Bonus Items: ", bonusItems));

        return mealDescription.toString();
    }
}
