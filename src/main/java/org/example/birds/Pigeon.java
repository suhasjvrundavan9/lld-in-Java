package org.example.birds;

public class Pigeon extends Bird implements Flying{

    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Pigeon is making sound");
    }
}
