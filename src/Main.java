import Core.DailyPhisicalEffort;
import Core.Kcal;
import Core.User;
import MIngrediens.Protein;

public class Main {

    public static void main(String[] args) {

        Ingredient jajucho =  new Ingredient("jajo",155,13.0,11,1.1);
        Ingredient boczek = new Ingredient("boczek",517,9,53,0);
        Ingredient chleb = new Ingredient("chleb",264,9,3.2,49);

        Meal meal = new Meal();

        meal.AddIngredient(jajucho,150);
        meal.AddIngredient(boczek,80);
        meal.AddIngredient(chleb,120);

        User user = new User("Adam","Adamski",32,83,DailyPhisicalEffort.LOW);
        UserHelper userHelper = new UserHelper(user);

        userHelper.ShowMacrosDemand(user.getDaylyKcalDemand(),user.getDaylyAllMacroDemand());

        meal.ShowIngredients();

        userHelper.EatMeal(meal);

        userHelper.ShowMacrosDemand(userHelper.getDailyRemainingKcal(),userHelper.getDayliRemainingMacroDemand());
    }
}
