import Core.Kcal;
import MIngrediens.Carbohydrate;
import MIngrediens.Fat;
import MIngrediens.GroupOfMacroIngredients;
import MIngrediens.Protein;

import java.net.Inet4Address;
import java.util.*;

public class Meal {

    List<Ingredient> ingredients;
    List<Double> grams;

    public Meal() {
        ingredients = new ArrayList<>();
        grams = new ArrayList<>();
    }

    public void AddIngredient(Ingredient ingredient,double massInGrams)
    {
        ingredients.add(ingredient);
        grams.add(massInGrams);
    }
    public void ShowIngredients()
    {
        for(int i=0;i<ingredients.size();i++)
        {
            System.out.println(ingredients.get(i).getName() + " : " + grams.get(i) +"g");
        }
    }

    public Kcal SumKcal()
    {
        Kcal k = new Kcal(0);
        for (int i=0;i<ingredients.size();i++) {

            k.addKcal(ingredients.get(i).getCalories().getCalories());
        }
        return k;
    }

    public GroupOfMacroIngredients SumAllMacro()
    {
        GroupOfMacroIngredients ingr = new GroupOfMacroIngredients(new Protein(0),new Fat(0),new Carbohydrate(0));

        for (int i=0;i<ingredients.size();i++) {

            ingr.getProteins().AddIngridientAmount(ingredients.get(i).getProteins().getAmout());
            ingr.getFats().AddIngridientAmount(ingredients.get(i).getFats().getAmout());
            ingr.getCarbohydrates().AddIngridientAmount(ingredients.get(i).getCarbohydrates().getAmout());
        }
        return  ingr;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Double> getGrams() {
        return grams;
    }

    public void setGrams(List<Double> grams) {
        this.grams = grams;
    }
}
