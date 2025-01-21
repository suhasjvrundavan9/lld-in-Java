package org.example.creational.factory;

public class Client {
    public static void main(String[] args) {
        DishFactory factory = new DishFactory();
        Dish pizza = factory.createDish("pizza");
        pizza.prepare();
        pizza.serve();


    }
}
