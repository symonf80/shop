import java.util.Scanner;



public class Main {
    //Magic Numbers Principle - вместо чисел используем константы
    public static final char RUB = (char) 0x20BD;

    public static void main(String[] args) {
        //Liskov substitution principle - наследники класса Product полностью играют роль предка
        Products[] products = {new Bcaa(), new Proteins(), new Creatine()};
        //принцип DRY - повторяющийся вывод списка продуктов на экран выносим в отдельный метод
        printProducts(products);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер товара и количество через пробел или введите 'нет'");
            String input = scanner.nextLine();
            if ("нет".equals(input))  break;
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            products[productNumber].setCount(Integer.parseInt(parts[1]));
        }
        printProducts(products);
        printBasket(products);
    }

    private static void printProducts(Products[] products) {
        System.out.println("Список товаров для покупки: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
        System.out.println("______________");
    }

    private static void printBasket(Products[] products) {
        int costProducts = 0;
        System.out.println("Ваша корзина: ");
        for (Products product : products) {
            if (product.getCount() != 0) {
                costProducts += product.getCount() * product.getPrice();
                System.out.println(product + " 'количество'=" + product.getCount() + " шт."
                        + "'цена'= " + product.getPrice() + " " + RUB
                        + "'стоимость'=" + product.getCount() * product.getPrice() + " " + RUB);
            }
        }
        System.out.println("Итого: " + costProducts + " " + RUB);
    }
}
