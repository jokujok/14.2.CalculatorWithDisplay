package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder {

    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {// [2]
        this.pizzaOrder = pizzaOrder;					// [3]
    }									            // [4]

    @Override
    public BigDecimal getCost() {					// [5]
        return pizzaOrder.getCost();
    }

    @Override
    public String getDescription() {					// [6]
        return pizzaOrder.getDescription();
    }
}
