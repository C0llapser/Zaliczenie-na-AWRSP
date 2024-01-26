package MIngrediens;

public class Ingredient {
    private String name;
    private Kcal calories;
    private GroupOfMacroIngredients allMacro;

    public Ingredient(String name, double calories, double proteins, double fats, double carbohydrates) {
        this.name = name;
        this.calories = new Kcal(calories);
        this.allMacro = new GroupOfMacroIngredients(new Protein(proteins), new Fat(fats),new Carbohydrate(carbohydrates));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Kcal getCalories() {
        return calories;
    }

    public void setCalories(Kcal calories) {
        this.calories = calories;
    }

    public Protein getProteins() {
        return allMacro.getProteins();
    }

    public void setProteins(Protein proteins) {
        this.allMacro.setProteins(proteins);
    }

    public Fat getFats() {
        return allMacro.getFats();
    }

    public void setFats(Fat fats) {
        this.allMacro.setFats(fats);
    }

    public Carbohydrate getCarbohydrates() {
        return allMacro.getCarbohydrates();
    }

    public void setCarbohydrates(Carbohydrate carbohydrates) {
        this.allMacro.setCarbohydrates(carbohydrates);
    }
}
