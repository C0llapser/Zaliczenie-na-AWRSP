package MIngrediens;

public class GroupOfMacroIngredients {

    private Protein proteins;
    private Fat fats;
    private Carbohydrate carbohydrates;

    public GroupOfMacroIngredients() {
    }

    public GroupOfMacroIngredients(Protein proteins, Fat fats, Carbohydrate carbohydrates) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public void substractMacroAmount(GroupOfMacroIngredients g)
    {
        proteins.SubstractIngridientAmount(g.getProteins().getDayliRequirament());
        fats.SubstractIngridientAmount(g.getFats().dayliRequirament);
        carbohydrates.SubstractIngridientAmount(g.getCarbohydrates().getDayliRequirament());
    }


    public Protein getProteins() {
        return proteins;
    }

    public Fat getFats() {
        return fats;
    }

    public void setProteins(Protein proteins) {
        this.proteins = proteins;
    }

    public void setFats(Fat fats) {
        this.fats = fats;
    }

    public void setCarbohydrates(Carbohydrate carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Carbohydrate getCarbohydrates() {
        return carbohydrates;
    }
}
