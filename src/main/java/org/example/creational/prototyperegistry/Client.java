package org.example.creational.prototyperegistry;

public class Client {
    public static void main(String[] args) {
        //create original objects
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(10,10);

        //create registry object
        ShapeRegistry registry = new ShapeRegistry();

        //save objects to registry
        registry.registerPrototype("circle",circle);
        registry.registerPrototype("rectangle", rectangle);

        //create a cloned circle object from registry method rather than creating it from scratch
        Shape clonedCircle = registry.clonePrototype("circle");
        clonedCircle.draw();
        Shape clonedRectangle = registry.clonePrototype("rectangle");
        clonedRectangle.draw();
    }
}
