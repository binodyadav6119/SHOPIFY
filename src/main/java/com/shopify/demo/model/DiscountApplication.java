package com.shopify.demo.model;

public class DiscountApplication {
    private String type;
    private String title;
    private String description;
    private String value;
    private String value_type;
    private String allocation_method;
    private String target_selection;
    private String target_type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue_type() {
        return value_type;
    }

    public void setValue_type(String value_type) {
        this.value_type = value_type;
    }

    public String getAllocation_method() {
        return allocation_method;
    }

    public void setAllocation_method(String allocation_method) {
        this.allocation_method = allocation_method;
    }

    public String getTarget_selection() {
        return target_selection;
    }

    public void setTarget_selection(String target_selection) {
        this.target_selection = target_selection;
    }

    public String getTarget_type() {
        return target_type;
    }

    public void setTarget_type(String target_type) {
        this.target_type = target_type;
    }
}
