package com.shopify.demo.model;

public class PriceSet {
    private Money shop_money;
    private Money presentment_money;

    // Getters and setters for all fields


    public Money getShop_money() {
        return shop_money;
    }

    public void setShop_money(Money shop_money) {
        this.shop_money = shop_money;
    }

    public Money getPresentment_money() {
        return presentment_money;
    }

    public void setPresentment_money(Money presentment_money) {
        this.presentment_money = presentment_money;
    }
}
