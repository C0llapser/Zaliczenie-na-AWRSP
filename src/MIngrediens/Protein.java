package MIngrediens;
import Core.DailyPhisicalEffort;

public class Protein extends MacroIngrediens{

    public Protein(double amount)
    {
        setAmout(amount);
        setName("Protein");
        setCalories(new Kcal(4));
    }

    public Protein(double kg, DailyPhisicalEffort dailyPhisicalEffort) {
        super(kg, dailyPhisicalEffort);
        setName("Protein");
        setCalories(new Kcal(4));
    }

    @Override
    public double calculateDemand(double kg, DailyPhisicalEffort dayliPhisicalEffort)
    {
        return switch (dayliPhisicalEffort) {
            case LOW -> kg * 1.0f;
            case MEDIUM -> kg * 1.2f;
            case HIGH -> kg * 1.4f;
            case OLIMPIAN -> kg * 1.8f;
        };
    }
}
