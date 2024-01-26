package main;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        MenuManager m = new MenuManager("UserData.txt");
        m.StartMenue();


        //MenuManager u =  new MenuManager();
    //u.StartProgra();


//        MIngrediens.Ingredient jajucho =  new MIngrediens.Ingredient("jajko",155,13.0,11,1.1);
//        MIngrediens.Ingredient boczek = new MIngrediens.Ingredient("boczek",517,9,53,0);
//        MIngrediens.Ingredient chleb = new MIngrediens.Ingredient("chleb",264,9,3.2,49);
//
//        rest.Meal meal = new rest.Meal();
//
//        meal.AddIngredient(jajucho,150);
//        meal.AddIngredient(boczek,80);
//        meal.AddIngredient(chleb,120);
//
//        User user = new User("Adam","Adamski",32,83,DailyPhisicalEffort.LOW);
//        Helper.UserHelper userHelper = new Helper.UserHelper(user);
//
//        userHelper.ShowMacrosDemand(user.getDaylyKcalDemand(),user.getDaylyAllMacroDemand());
//
//        meal.ShowIngredients();
//
//        userHelper.EatMeal(meal);
//
//        userHelper.ShowMacrosDemand(userHelper.getDailyRemainingKcal(),userHelper.getDayliRemainingMacroDemand());
    }
}
