package StrategyPattern.Duck;

import StrategyPattern.Flight.NoFly;
import StrategyPattern.Quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new NoFly());
        setQuackBehavior(new Squeak());
    }
}
