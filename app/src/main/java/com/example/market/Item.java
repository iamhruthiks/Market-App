package com.example.market;

public class Item {

    String itemName,itemDesc;
    int itemImage;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public Item(String itemName, String itemDesc, int itemImage) {
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemImage = itemImage;
    }
}
