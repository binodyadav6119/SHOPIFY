package com.shopify.demo.model;

import java.util.List;

public class ShippingLine {
    private String code;
    private String price;
    private MoneySet price_set;
    private String discounted_price;
    private MoneySet discounted_price_set;
    private String source;
    private String title;
    private List<TaxLine> tax_lines;
    private String carrier_identifier;
    private String requested_fulfillment_service_id;
    private Boolean is_removed;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public MoneySet getPrice_set() {
        return price_set;
    }

    public void setPrice_set(MoneySet price_set) {
        this.price_set = price_set;
    }

    public String getDiscounted_price() {
        return discounted_price;
    }

    public void setDiscounted_price(String discounted_price) {
        this.discounted_price = discounted_price;
    }

    public MoneySet getDiscounted_price_set() {
        return discounted_price_set;
    }

    public void setDiscounted_price_set(MoneySet discounted_price_set) {
        this.discounted_price_set = discounted_price_set;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<TaxLine> getTax_lines() {
        return tax_lines;
    }

    public void setTax_lines(List<TaxLine> tax_lines) {
        this.tax_lines = tax_lines;
    }

    public String getCarrier_identifier() {
        return carrier_identifier;
    }

    public void setCarrier_identifier(String carrier_identifier) {
        this.carrier_identifier = carrier_identifier;
    }

    public String getRequested_fulfillment_service_id() {
        return requested_fulfillment_service_id;
    }

    public void setRequested_fulfillment_service_id(String requested_fulfillment_service_id) {
        this.requested_fulfillment_service_id = requested_fulfillment_service_id;
    }

    public Boolean getIs_removed() {
        return is_removed;
    }

    public void setIs_removed(Boolean is_removed) {
        this.is_removed = is_removed;
    }
}
