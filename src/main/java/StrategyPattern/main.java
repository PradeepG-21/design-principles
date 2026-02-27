package StrategyPattern;

import StrategyPattern.Duck.Duck;
import StrategyPattern.Duck.RubberDuck;
import StrategyPattern.Flight.Fly;

public class main {
    public static void main(String[] args) {

        Duck duck = new RubberDuck();
        duck.fly();
        duck.quack();

        duck.setFlyBehavior(new Fly());
        duck.fly();
    }
}
