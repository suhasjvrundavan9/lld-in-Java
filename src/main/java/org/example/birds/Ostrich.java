package org.example.birds;

public class Ostrich extends Bird{

    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Ostrich is making sound");
    }
}
