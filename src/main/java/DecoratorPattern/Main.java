package DecoratorPattern;

import DecoratorPattern.Beverage.Beverage;
import DecoratorPattern.Beverage.DarkRoast;
import DecoratorPattern.Beverage.Espresso;
import DecoratorPattern.Condiments.ChocolateDecorator;
import DecoratorPattern.Condiments.MilkDecorator;

public class Main {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        Beverage withChocolate = new ChocolateDecorator(darkRoast);
        System.out.println(withChocolate.cost());
        System.out.println(withChocolate.description());

        System.out.println();

        Beverage withMilk = new MilkDecorator(withChocolate);
        System.out.println(withMilk.cost());
        System.out.println(withMilk.description());

        System.out.println();

        Beverage espresso = new Espresso();
        espresso = new ChocolateDecorator(espresso);
        espresso = new MilkDecorator(espresso);
        System.out.println(espresso.cost());
        System.out.println(espresso.description());
    }
}
