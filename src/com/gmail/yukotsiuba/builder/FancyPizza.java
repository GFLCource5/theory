package com.gmail.yukotsiuba.builder;

public class FancyPizza extends Pizza{

    private String extraIngredient;

    public FancyPizza(String cheese, String crust, String sauce, String toppings, String extraIngredient) {
        super(cheese + "+ extra cheese", crust, sauce, toppings);
        this.extraIngredient = extraIngredient;
    }

    public String getExtraIngredient() {
        return extraIngredient;
    }

    public void setExtraIngredient(String extraIngredient) {
        this.extraIngredient = extraIngredient;
    }
    
    @Override
    public String toString() {
        return "Fancy Pizza: " +
                "Crust='" + getCrust() + '\'' +
                ", Sauce='" + getSauce() + '\'' +
                ", Toppings='" + getToppings() + '\'' +
                ", Cheese='" + getCheese() + '\'' +
                ", Extra Ingredient='" + extraIngredient + '\'';
    }
}
