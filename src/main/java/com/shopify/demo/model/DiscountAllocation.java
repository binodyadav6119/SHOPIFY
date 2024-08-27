package com.shopify.demo.model;

public class DiscountAllocation {
    private String amount;
    private Integer discount_application_index;
    private MoneySet amount_set;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Integer getDiscount_application_index() {
        return discount_application_index;
    }

    public void setDiscount_application_index(Integer discount_application_index) {
        this.discount_application_index = discount_application_index;
    }

    public MoneySet getAmount_set() {
        return amount_set;
    }

    public void setAmount_set(MoneySet amount_set) {
        this.amount_set = amount_set;
    }
}
