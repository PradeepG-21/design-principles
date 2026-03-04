package DecoratorPattern.Condiments;

import DecoratorPattern.Beverage.Beverage;

public class MilkDecorator extends CondimentsDecorator {

    public MilkDecorator(Beverage b) {
        super(b);
    }

    @Override
    public int cost() {
        return 50 + beverage.cost();
    }

    @Override
    public String description() {
        return beverage.description() + " + Milk";
    }
}
