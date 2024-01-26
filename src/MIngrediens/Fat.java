package MIngrediens;

import Core.DailyPhisicalEffort;

public class Fat extends MacroIngrediens{

    public Fat(double amount)
    {
        setAmout(amount);
        setName("Fat");
        setCalories(new Kcal(9));
    }

    public Fat(double kg, DailyPhisicalEffort dailyPhisicalEffort) {
        super(kg, dailyPhisicalEffort);
        setName("Fat");
        setCalories(new Kcal(9));
    }

    @Override
    public double calculateDemand(double kg, DailyPhisicalEffort dayliPhisicalEffort)
    {
        return kg;
    }
}