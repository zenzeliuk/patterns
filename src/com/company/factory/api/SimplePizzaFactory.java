package com.company.factory.api;

import com.company.factory.pizza.*;

public class SimplePizzaFactory {

    public Pizza createPizza(TypeOfPizza type) {
        Pizza pizza = null;

        if (type.equals(TypeOfPizza.CHEESE)) {
            pizza = new CheesePizza();
        } else if (type.equals(TypeOfPizza.PEPPERONI)) {
            pizza = new PepperoniPizza();
        } else if (type.equals(TypeOfPizza.CLAM)) {
            pizza = new ClamPizza();
        } else if (type.equals(TypeOfPizza.VEGGIE)) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
