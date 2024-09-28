package ru.yandex.practicum.model;

import ru.yandex.practicum.model.constants.Colour;
import ru.yandex.practicum.model.constants.Discount;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals(Colour.RED_APPLE) ? Discount.APPLE_DISCOUNT : Discount.WITHOUT_DISCOUNT;
    }
}
