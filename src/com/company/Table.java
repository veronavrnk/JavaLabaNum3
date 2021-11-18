package com.company;

public class Table extends Furniture {
    private String shape;
    private String color;

    public Table(String manufacturer, int price, String material) {
        super(manufacturer, price, material);
    }

    public Table(String manufacturer, int price, String material, String color, String shape) {
        super(manufacturer, price, material);
        this.color = color;
        this.shape = shape;
    }

    public Table(String manufacturer, int price, String material, String shape) {
        super(manufacturer, price, material);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }
}