package LLD.DesignPatterns.Creational.Factory;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Shape> shapes = new HashMap<String, Shape>() {{
        put("rectangle", new Rectangle());
        put("square", new Square());
    }};

    public static Shape getShape(String text) {
        return shapes.get(text);
    }
}
