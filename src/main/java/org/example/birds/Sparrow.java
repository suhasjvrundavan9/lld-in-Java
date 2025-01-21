package org.example.birds;

public class Sparrow extends Bird implements Flying{
    FlyingBehaviour fb;

    Sparrow(FlyingBehaviour fb){
        this.fb = fb;
    }

    @Override
    public void fly() {
        fb.makeFly();
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow is making sound");
    }
}
