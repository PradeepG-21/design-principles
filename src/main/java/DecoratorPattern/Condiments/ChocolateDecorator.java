package DecoratorPattern.Condiments;

import DecoratorPattern.Beverage.Beverage;

public class ChocolateDecorator extends CondimentsDecorator{

    public ChocolateDecorator(Beverage b) {
        super(b);
    }

    @Override
    public int cost() {
        return 100 + beverage.cost();
    }

    @Override
    public String description() {
        return beverage.description() + " + Chocolate";
    }
}
