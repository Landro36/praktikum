package praktikum;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        var meat = new Meat(5, 100.0, false);
        var red = new Apple(10, 50.0, Colour.RED, true);
        var green = new Apple(8, 60.0, Colour.GREEN, true);

        Food[] items = {meat, red, green};
        var cart = new ShoppingCart(items);

        System.out.println("общая сумма товаров без скидки: " + cart.totalPrice());
        System.out.println("общая сумма товаров со скидкой: " + cart.discountPrice());
        System.out.println("сумма всех вегетарианских продуктов без скидки: " + cart.veganPrice());

    }
}
