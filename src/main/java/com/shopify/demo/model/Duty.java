package com.shopify.demo.model;

import java.util.List;

public class Duty {
    private String id;
    private String harmonized_system_code;
    private String country_code_of_origin;
    private Money shop_money;
    private Money presentment_money;
    private List<TaxLine> tax_lines;
    private String admin_graphql_api_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHarmonized_system_code() {
        return harmonized_system_code;
    }

    public void setHarmonized_system_code(String harmonized_system_code) {
        this.harmonized_system_code = harmonized_system_code;
    }

    public String getCountry_code_of_origin() {
        return country_code_of_origin;
    }

    public void setCountry_code_of_origin(String country_code_of_origin) {
        this.country_code_of_origin = country_code_of_origin;
    }

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

    public List<TaxLine> getTax_lines() {
        return tax_lines;
    }

    public void setTax_lines(List<TaxLine> tax_lines) {
        this.tax_lines = tax_lines;
    }

    public String getAdmin_graphql_api_id() {
        return admin_graphql_api_id;
    }

    public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
        this.admin_graphql_api_id = admin_graphql_api_id;
    }
}
