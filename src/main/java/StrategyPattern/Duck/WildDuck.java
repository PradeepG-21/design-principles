package StrategyPattern.Duck;

import StrategyPattern.Flight.Fly;
import StrategyPattern.Quack.NormalQuack;

public class WildDuck extends Duck{

    public WildDuck() {
        super(new NormalQuack(), new Fly());
    }
}
