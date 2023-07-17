package builder.builders;

import common.models.*;

public interface MealBuilder {
    void setName(MealName mealName);
    void addMainDish(MainDish mainDish);
    void addSideDish(SideDish sideDish);
    void addDrink(Drink drink);
    void addDressing(Dressing dressing);
    void addBonusItems(BonusItems bonusItems);
}
