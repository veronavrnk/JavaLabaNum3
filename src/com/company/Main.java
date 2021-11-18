package com.company;

public class Main {

    public static void main(String[] args) {
        Furniture furniture = new Chair("Икея", 1700, "дуб");
        System.out.println("Производитель: " + furniture.getManufacture());
        System.out.println("Стоймость: " + furniture.getPrice());
        System.out.println("Материал: " + furniture.getMaterial());
        FurnitureShop shopping = new FurnitureShop(10);
        System.out.println(shopping.getGoods());
        System.out.println("Было куплено: "+ shopping.buyItem(1));
        System.out.println(shopping.getGoods());


    }
}
