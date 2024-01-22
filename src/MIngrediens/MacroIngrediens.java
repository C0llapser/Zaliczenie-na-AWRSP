package MIngrediens;
import Core.DailyPhisicalEffort;
import Core.Kcal;

public abstract class MacroIngrediens {

    double amout;
    String name;
    Kcal calories;
    double dayliRequirament;

    public void AddIngridientAmount(double amout)
    {
        this.dayliRequirament += amout;
    }
    public void SubstractIngridientAmount(double amout)
    {
        this.dayliRequirament -= amout;
    }

    public MacroIngrediens(double kg, DailyPhisicalEffort dailyPhisicalEffort) {
        this.dayliRequirament = calculateDemand(kg,dailyPhisicalEffort);
    }

    public MacroIngrediens(double amout) {
        this.amout = amout;
    }

    public double getAmout() {
        return amout;
    }

    public void setAmout(double amout) {
        this.amout = amout;
    }

    public MacroIngrediens() {
    }

    public Kcal getCalories() {
        return calories;
    }

    public void setCalories(Kcal calories) {
        this.calories = calories;
    }

    public double getDayliRequirament() {
        return dayliRequirament;
    }

    public void setDayliRequirament(double kg, DailyPhisicalEffort phisicalEffort) {
        this.dayliRequirament = calculateDemand(kg,phisicalEffort);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateDemand(double kg, DailyPhisicalEffort df);
}
