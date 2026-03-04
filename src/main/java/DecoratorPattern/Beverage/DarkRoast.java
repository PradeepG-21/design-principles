package DecoratorPattern.Beverage;

public class DarkRoast implements Beverage{

    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String description() {
        return "This is a DarkRoast";
    }
}
