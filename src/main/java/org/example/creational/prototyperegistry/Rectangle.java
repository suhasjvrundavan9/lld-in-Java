package org.example.creational.prototyperegistry;

public class Rectangle implements Shape {
    private String type;
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.type = "rectangle";
        this.width = width;
        this.height = height;
    }

    //clone method
    @Override
    public Shape clone() {
        return new Rectangle(this.width,this.height);
    }

    //print method
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
