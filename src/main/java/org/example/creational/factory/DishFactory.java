package org.example.creational.factory;

public class DishFactory {
    public static Dish createDish(String dishName){
        if(dishName.equalsIgnoreCase("pizza")){
            return new Pizza();
        }else if(dishName.equalsIgnoreCase("sushi")){
            return new Sushi();
        }

        throw new RuntimeException("dish is not valid");
    }
}
