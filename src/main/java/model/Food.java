package model;

import model.constants.Discount;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getDiscount() {
        return Discount.DEFAULT;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double totalPrice() {
        return amount * price;
    }

    public  double discountPrice() {
        return totalPrice() * (100 - getDiscount()) / 100.0;
    }
}
