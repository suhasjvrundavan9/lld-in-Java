package org.example.birds;

public class CrowSparrowFlyingBehaviour implements FlyingBehaviour{

    FlyingBehaviour fb;

    CrowSparrowFlyingBehaviour (FlyingBehaviour fb){
        this.fb = fb;
    }

    @Override
    public void makeFly() {
        System.out.println("Crow and Sparrow are flying in same way");
    }
}
