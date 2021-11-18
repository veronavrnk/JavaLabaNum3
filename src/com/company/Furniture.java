package com.company;

public abstract class Furniture {
private String manufacture;
private int price;
private String material;

public Furniture(String manufacture,int price,String material)
{
    this.manufacture=manufacture;
    this.material=material;
    this.price=price;
}

public String getManufacture(){
    return manufacture;
}
public String getMaterial(){
    return material;
}
public int getPrice(){
    return price;
}
}
