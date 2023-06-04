package LLD.DesignPatterns.Structural.Decorator.Toppings;

import LLD.DesignPatterns.Structural.Decorator.Pizza.BasePizza;

public class Jalapeno extends ToppingDecorator {
    BasePizza basePizza;

    public Jalapeno(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost() {
        return this.basePizza.cost() + 100;
    }
}
