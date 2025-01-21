package org.example.birds;

public class Penguin extends Bird{

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin is making sound");
    }
}
