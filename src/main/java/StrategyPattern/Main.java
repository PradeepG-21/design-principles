package StrategyPattern;

import StrategyPattern.Duck.Duck;
import StrategyPattern.Duck.RubberDuck;
import StrategyPattern.Duck.WildDuck;
import StrategyPattern.Flight.Fly;

public class Main {
    public static void main(String[] args) {

        System.out.println("----- Rubber Duck -----");
        Duck duck = new RubberDuck();
        duck.fly();
        duck.quack();

        duck.setFlyBehavior(new Fly());
        duck.fly();

        System.out.println();
        System.out.println("----- Wild Duck -----");
        Duck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.quack();
    }
}
