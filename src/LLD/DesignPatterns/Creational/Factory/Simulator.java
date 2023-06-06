package LLD.DesignPatterns.Creational.Factory;

public class Simulator {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("square");
        System.out.println(shape.myShape());
    }
}
