package StrategyPattern.Quack;

public class NormalQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack!!");
    }
}
