package com.company;

public class FurnitureShop {
    private Furniture[] items;

    public FurnitureShop(int counter){
        items = new Furniture[counter];
        for (int i = 0; i < counter;) {
          items[i++] = new Wardrobe("Икея",12000,"Дуб",120,120,230);
            if (i>=counter) break;
            items[i++] = new Table("Касторама",9000,"Меламин","Черный","Круглый");
            if (i>=counter) break;
            items[i++] = new Chair("Стройландия",5000,"Бук","Барный");
            if (i>=counter) break;

        }

    }
    public Furniture[] getItems() {
        return items;
    }
    public Furniture buyItem(int number){
        Furniture furn = items[number];
        Furniture[] tmp = new Furniture[items.length-1];
        for (int i = 0; i < items.length; i++){
            if(i < number) tmp[i] = items[i];
            if (i > number) tmp[i-1] = items[i];
        }
        items = tmp;
        return furn;
    }
    public String getGoods(){
        String res = "Магазин продаёт следующие товары:\n\n";
        for (Furniture furn : items) {
            res += furn.toString() + "\n";
        }
        return res;
    }

}
