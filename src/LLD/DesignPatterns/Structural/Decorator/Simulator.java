package LLD.DesignPatterns.Structural.Decorator;

import LLD.DesignPatterns.Structural.Decorator.Pizza.BasePizza;
import LLD.DesignPatterns.Structural.Decorator.Pizza.ChickenPizza;
import LLD.DesignPatterns.Structural.Decorator.Pizza.FarmhousePizza;
import LLD.DesignPatterns.Structural.Decorator.Toppings.Cheese;
import LLD.DesignPatterns.Structural.Decorator.Toppings.Jalapeno;

class Simulator {
    public static void main(String[] args) {
        BasePizza pizza1 = new Cheese(new ChickenPizza());
        BasePizza pizza2 = new Jalapeno(new Cheese(new ChickenPizza()));
        BasePizza pizza3 = new Cheese(new Cheese(new FarmhousePizza()));

        System.out.println(pizza1.cost());
        System.out.println(pizza2.cost());
        System.out.println(pizza3.cost());
    }

}
