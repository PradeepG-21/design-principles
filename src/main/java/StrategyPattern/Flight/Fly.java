package StrategyPattern.Flight;

public class Fly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I believe I can fly!!");
    }
}
