package ru.yandex.practicum.service;

import ru.yandex.practicum.model.Food;

public class ShoppingCart {

    private Food[] arrayFoods;

    public ShoppingCart(Food[] arrayFoods) {
        this.arrayFoods = arrayFoods;
    }

    public double getFullPrice() {
        double fullPrice = 0;
        for (Food food: arrayFoods) {
            fullPrice += food.getAmount() * food.getPrice();

        }
        return fullPrice;
    }

    public double getPriceWithDiscount() {
        double discountPrice = 0;
        for(Food food : arrayFoods) {
            discountPrice += ((food.getAmount() * food.getPrice())) - (((food.getAmount() * food.getPrice()) * food.getDiscount()) / 100);
        }
        return discountPrice;
    }

    public double getVegetarianPrice() {
        double vegetarianPrice = 0;
        for (Food food : arrayFoods) {
            if(food.isVegetarian()) {
                vegetarianPrice += food.getPrice() * food.getAmount();
            }
        }
        return vegetarianPrice;
    }
}
