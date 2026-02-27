package StrategyPattern.Duck;

import StrategyPattern.Flight.FlyBehavior;
import StrategyPattern.Quack.QuackBehavior;

public abstract class Duck {
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
