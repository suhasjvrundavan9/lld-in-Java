package org.example.creational.abstractfactory;

public class Pizza implements Dish {
    @Override
    public void prepare() {
        System.out.println("preparing pizza...");
    }

    @Override
    public void serve() {
        System.out.println("Serving pizza...");
    }
}
