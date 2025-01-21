package org.example.creational.abstractfactory;

public class SushiFactory implements DishFactory{
    @Override
    public Dish createDish() {
        return new Sushi();
    }
}
