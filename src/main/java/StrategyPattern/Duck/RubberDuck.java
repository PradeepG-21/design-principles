package StrategyPattern.Duck;

import StrategyPattern.Flight.NoFly;
import StrategyPattern.Quack.Squeak;

public class RubberDuck extends Duck {


    public RubberDuck() {
        super(new Squeak(), new NoFly());
    }
}
