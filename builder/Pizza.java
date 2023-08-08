package builder;

import java.util.Objects;

public class Pizza {
    private Size size;
    private boolean cheese;
    private boolean sausage;
    private boolean tomatoes;
    private boolean pepper;
    private boolean mushrooms;
    private boolean olives;

    protected Pizza() {

    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean hasSausage() {
        return sausage;
    }

    public void setSausage(boolean sausage) {
        this.sausage = sausage;
    }

    public boolean hasTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(boolean tomatoes) {
        this.tomatoes = tomatoes;
    }

    public boolean hasPepper() {
        return pepper;
    }

    public void setPepper(boolean pepper) {
        this.pepper = pepper;
    }

    public boolean hasMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    public boolean hasOlives() {
        return olives;
    }

    public void setOlives(boolean olives) {
        this.olives = olives;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return cheese == pizza.cheese && sausage == pizza.sausage && tomatoes == pizza.tomatoes && pepper == pizza.pepper && mushrooms == pizza.mushrooms && olives == pizza.olives && size == pizza.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, cheese, sausage, tomatoes, pepper, mushrooms, olives);
    }

    @Override
    public String toString() {
        return "Pizza{" + "size=" + size +
                ", cheese=" + cheese +
                ", sausage=" + sausage +
                ", tomatoes=" + tomatoes +
                ", pepper=" + pepper +
                ", mushrooms=" + mushrooms +
                ", olives=" + olives +
                '}';
    }
}