package org.example.creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        DishFactory pizzaFactory = new PizzaFactory();
        Dish pizza = pizzaFactory.createDish();
        pizza.prepare();
        pizza.serve();

        DishFactory sushiFactory = new SushiFactory();
        Dish sushi = sushiFactory.createDish();
        sushi.prepare();
        sushi.serve();
    }
}
