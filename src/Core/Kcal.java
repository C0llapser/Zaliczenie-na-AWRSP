package Core;

public class Kcal {

    private double calories ;


    public void CalculateKcalDemand(double kg)
    {
        calories = 20*kg;
    }

    public void addKcal(double kcal)
    {
        calories += kcal;
    }

    public void subtractKcal(double kcal)
    {
        calories -= kcal;
    }

    public Kcal(){}
    public Kcal(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double GetKilojules() {
        return calories * 4.18;
    }
}
