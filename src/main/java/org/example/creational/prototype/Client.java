package org.example.creational.prototype;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(10,10);

        System.out.println("circle and rectangle initial objects");
        circle.draw();
        rectangle.draw();

        Shape clonedCircle = circle.clone();
        Shape clonedRectangle = rectangle.clone();

        System.out.println("cloned circle and rectangle objects");
        clonedCircle.draw();
        clonedRectangle.draw();
    }
}
