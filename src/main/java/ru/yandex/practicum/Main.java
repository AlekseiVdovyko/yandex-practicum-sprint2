package ru.yandex.practicum;

import ru.yandex.practicum.model.Apple;
import ru.yandex.practicum.model.Food;
import ru.yandex.practicum.model.Meat;
import ru.yandex.practicum.model.constants.Colour;
import ru.yandex.practicum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, Colour.RED_APPLE);
        Apple appleGreen = new Apple(8, 60, Colour.GREEN_APPLE);

        Food[] arrayFood = {meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(arrayFood);

        System.out.println("Общая сумма без скидки: " + shoppingCart.getFullPrice() + " рублей");
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getPriceWithDiscount() + " рублей");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getVegetarianPrice() + " рублей");
    }
}