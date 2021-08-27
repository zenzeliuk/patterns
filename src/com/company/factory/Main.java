package com.company.factory;

import com.company.factory.api.PizzaStore;
import com.company.factory.api.SimplePizzaFactory;
import com.company.factory.api.TypeOfPizza;
import com.company.factory.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza(TypeOfPizza.CHEESE);
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza(TypeOfPizza.VEGGIE);
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
