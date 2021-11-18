package com.company;

public class Chair extends Furniture{

    private String type;

    public Chair(String manufacturer, int price, String material) {
        super(manufacturer, price, material);
    }

    public Chair(String manufacturer, int price, String material, String type) {
        super(manufacturer, price, material);
        this.type = type;
    }

    public Chair(int price, String material, String type) {
        super(material, price, material);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
