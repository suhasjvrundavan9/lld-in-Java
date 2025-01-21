package org.example.creational.prototyperegistry;

public class Circle implements Shape {
    private String type;
    private int radius;

    public Circle(int radius){
        this.type = "circle";
        this.radius = radius;
    }

    //clone method
    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }

    //print method
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
