package Helpers;

import MIngrediens.Kcal;
import Core.User;
import MIngrediens.GroupOfMacroIngredients;
import Core.Meal;

public class UserHelper {

    private User user;
    private Kcal dailyRemainingKcal;
    private GroupOfMacroIngredients dayliRemainingMacroDemand;

    public UserHelper(User user) {
        this.user = user;
        dailyRemainingKcal = user.getDaylyKcalDemand();
        dayliRemainingMacroDemand = user.getDaylyAllMacroDemand();
    }

    public Kcal getDailyRemainingKcal() {
        return dailyRemainingKcal;
    }

    public void setDailyRemainingKcal(Kcal dayliRemainingKcal) {
        this.dailyRemainingKcal = dayliRemainingKcal;
    }

    public GroupOfMacroIngredients getDayliRemainingMacroDemand() {
        return dayliRemainingMacroDemand;
    }

    public void setDayliRemainingMacroDemand(GroupOfMacroIngredients dailyRemainingMacroDemand) {
        this.dayliRemainingMacroDemand = dayliRemainingMacroDemand;
    }

    public void EatMeal(Meal meal)
    {
        dailyRemainingKcal.subtractKcal(meal.SumKcal().getCalories());
        dayliRemainingMacroDemand.substractMacroAmount(meal.SumAllMacro());
    }

    public void ShowMacrosDemand(Kcal kcal,GroupOfMacroIngredients groupOfMacroIngredients)
    {
        System.out.println("Dzienne zapotrzebowanie Kalorii :" + kcal.getCalories() );
        System.out.println("Dzienne zapotrzebowanie na białko :" + groupOfMacroIngredients.getProteins().getDayliRequirament());
        System.out.println("Dzienne zapotrzebowanie na tłuszcze :" + groupOfMacroIngredients.getFats().getDayliRequirament());
        System.out.println("Dzienne zapotrzebowanie na weglowodany :" + groupOfMacroIngredients.getCarbohydrates().getDayliRequirament());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
