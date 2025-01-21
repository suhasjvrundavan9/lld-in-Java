package org.example.birds;

public class Crow extends Bird implements Flying{

    FlyingBehaviour fb;

    Crow(FlyingBehaviour fb){
        this.fb = fb;
    }

    @Override
    public void fly() {
        fb.makeFly();
    }

    @Override
    public void eat() {
        System.out.println("Crow is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Crow is making sound");
    }
}
