package com.company;

public class Wardrobe extends Furniture {
    private int width;
    private int depth;
    private int height;

    public Wardrobe(String manufacture, int price, String material) {
        super(manufacture, price, material);
    }

    public Wardrobe(String manufacture, int price, String material, int width, int depth, int height) {
        super(manufacture, price, material);
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public Wardrobe(String manufacture, int price, String material, int width,int height) {
        super(manufacture, price, material);
        this.width = width;
        this.height = height;
    }


    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }
}