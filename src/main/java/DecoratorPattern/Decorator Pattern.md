# Decorator Pattern
The decorator pattern is useful in situations where we want to decorate a base object with additional capabilities, but we do not want to create classes for each of the combinations. The requirement to create too many classes is known as class explotion.

### Definition
The decorator pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

### Explanation
A decorator is an abstract class that IS-A type of the object class it wishes to decorate and also HAS-A object of the type it wishes to decorate.
A decorator cannot exist on its own, and needs a base object to decorate. This is ensured using a parameterized constructor.

By both being a type of the object that it wishes to decorate and also containing an object of the type it wishes to decorate, it becomes incredibly flexible and we can wrap layers upon layers of decorators.
It can be thought of to be similar to recursion.

The decorator's answer is an augmentation of the response that it gets from the object that it contains.

In our example, assume that milk is not sold separately. Milk is solely a decorator. Thus, getting cost of milk alone separately does not make much sense. However, now, milk is a decorator and it can decorate any object. Assume it is decorating a base Espresso object. 

Now, the cost of the Milk Decorated beverage can be accessed the same way as the base beverage since they all implement the same type "Beverage". Only difference is the implementation of the cost methods of decorators. They add their own cost on top of the objects they decorate.

It is now also possible to decorate the milk decorated espresso with an additional chocolate decorator. In order to achieve this, we need not have to create a new class or modify any of the existing logic. Instead, we simply during runtime, decorate the object with a chocolate decorator.

```java
Beverage espresso = new Espresso();
espresso = new MilkDecorator(espresso);
espresso = new ChocolateDecorator(espresso);
System.out.println(espresso.cost());
System.out.println(espresso.description());
```

### Implementation
The Decorator must be an abstract class since it needs to define a variable of the object that it decorates and also a constructor that sets the value of the object that it contains.

The Decorator and the Base object must all implement the same interface. This ensures that the decorated object, multi layered decorated object and the base object can be treated the same way at runtime ensuring extreme flexibility.