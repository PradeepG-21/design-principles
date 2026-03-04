package DecoratorPattern.Condiments;

import DecoratorPattern.Beverage.Beverage;

public abstract class CondimentsDecorator implements Beverage {
    Beverage beverage;

    public CondimentsDecorator(Beverage b) {
        this.beverage = b;
    }

    public abstract int cost();
    public abstract String description();
}
