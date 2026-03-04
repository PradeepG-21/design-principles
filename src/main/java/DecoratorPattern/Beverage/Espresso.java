package DecoratorPattern.Beverage;

public class Espresso implements Beverage{

    @Override
    public int cost() {
        return 500;
    }

    @Override
    public String description() {
        return "This is an Espresso";
    }
}
