package builder.builders;

import common.models.*;

public class McBuilder implements MealBuilder {
    private MealName mealName;
    private MainDish mainDish;
    private SideDish sideDish;
    private Drink drink;
    private Dressing dressing;
    private BonusItems bonusItems;

    @Override
    public void setName(MealName mealName) {
        this.mealName = mealName;
    }

    @Override
    public void addMainDish(MainDish mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void addSideDish(SideDish sideDish) {
        this.sideDish = sideDish;
    }

    @Override
    public void addDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void addDressing(Dressing dressing) {
        this.dressing = dressing;
    }

    @Override
    public void addBonusItems(BonusItems bonusItems) {
        this.bonusItems = bonusItems;
    }

    public Meal buildMeal() {
        return new Meal(mealName, mainDish, sideDish, drink, dressing, bonusItems);
    }
}
