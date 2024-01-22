package MIngrediens;

import Core.DailyPhisicalEffort;
import Core.Kcal;

public class Carbohydrate extends MacroIngrediens{

    public Carbohydrate(double amount)
    {
        setAmout(amount);
        setName("Carbohydrate");
        setCalories(new Kcal(4));
    }

    public Carbohydrate(double kg, DailyPhisicalEffort dailyPhisicalEffort) {
        super(kg, dailyPhisicalEffort);
        setName("Carbohydrate");
        setCalories(new Kcal(4));
    }

    @Override
    public double calculateDemand(double kg, DailyPhisicalEffort dayliPhisicalEffort)
    {
        return switch (dayliPhisicalEffort) {
            case LOW -> kg * 4.0f;
            case MEDIUM -> kg * 5.0f;
            case HIGH -> kg * 6.0f;
            case OLIMPIAN -> kg * 8.0f;
        };
    }
}