package LLD.DesignPatterns.Structural.Decorator.Toppings;

import LLD.DesignPatterns.Structural.Decorator.Pizza.BasePizza;

public class Cheese extends ToppingDecorator {
    BasePizza basePizza;

    public Cheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost() {
        return this.basePizza.cost() + 150;
    }
}
