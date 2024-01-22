package Core;

import MIngrediens.Carbohydrate;
import MIngrediens.Fat;
import MIngrediens.GroupOfMacroIngredients;
import MIngrediens.Protein;

import javax.xml.crypto.Data;

public class User {

    private String imie;
    private String nazwisko;
    private int age;
    private int weight;
    private DailyPhisicalEffort dailyPhisicalEffort;

    private Kcal daylyKcalDemand;
    private GroupOfMacroIngredients daylyAllMacroDemand;

    public GroupOfMacroIngredients getDaylyAllMacroDemand() {
        return daylyAllMacroDemand;
    }

    public void setDaylyAllMacroDemand(GroupOfMacroIngredients daylyAllMacroDemand) {
        this.daylyAllMacroDemand = daylyAllMacroDemand;
    }

    public User(String imie, String nazwisko, int age, int weight, DailyPhisicalEffort dpf) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.age = age;
        this.weight = weight;
        this.dailyPhisicalEffort = dpf;

        daylyKcalDemand = new Kcal();
        daylyKcalDemand.CalculateKcalDemand(weight);
        daylyAllMacroDemand = new GroupOfMacroIngredients(new Protein(weight,dpf),new Fat(weight,dpf),new Carbohydrate(weight,dpf));
    }

    public Kcal getDaylyKcalDemand() {
        return daylyKcalDemand;
    }

    public void setDaylyKcalDemand(Kcal daylyKcalDemand) {
        this.daylyKcalDemand = daylyKcalDemand;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public DailyPhisicalEffort getDailyPhisicalEffort() {
        return dailyPhisicalEffort;
    }

    public void setDailyPhisicalEffort(DailyPhisicalEffort dailyPhisicalEffort) {
        this.dailyPhisicalEffort = dailyPhisicalEffort;
    }

}
