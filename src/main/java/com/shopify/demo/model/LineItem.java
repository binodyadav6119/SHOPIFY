package com.shopify.demo.model;

import java.util.List;

public class LineItem {
    private List<AttributedStaff> attributed_staffs;
    private Integer fulfillable_quantity;
    private String fulfillment_service;
    private String fulfillment_status;
    private Integer grams;
    private Long id;
    private String price;
    private Long product_id;
    private Integer quantity;
    private Integer current_quantity;
    private Boolean requires_shipping;
    private String sku;
    private String title;
    private Long variant_id;
    private String variant_title;
    private String vendor;
    private String name;
    private Boolean gift_card;
    private Boolean product_exists;
    private MoneySet price_set;
    private List<Property> properties;
    private Boolean taxable;
    private List<TaxLine> tax_lines;
    private String total_discount;
    private MoneySet total_discount_set;
    private List<DiscountAllocation> discount_allocations;
    private OriginLocation origin_location;
    private List<Duty> duties;
    private String admin_graphql_api_id;
    private String variant_inventory_management;

    public Boolean getProduct_exists() {
        return product_exists;
    }

    public void setProduct_exists(Boolean product_exists) {
        this.product_exists = product_exists;
    }

    public String getAdmin_graphql_api_id() {
        return admin_graphql_api_id;
    }

    public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
        this.admin_graphql_api_id = admin_graphql_api_id;
    }

    public String getVariant_inventory_management() {
        return variant_inventory_management;
    }

    public void setVariant_inventory_management(String variant_inventory_management) {
        this.variant_inventory_management = variant_inventory_management;
    }

    public List<AttributedStaff> getAttributed_staffs() {
        return attributed_staffs;
    }

    public void setAttributed_staffs(List<AttributedStaff> attributed_staffs) {
        this.attributed_staffs = attributed_staffs;
    }

    public Integer getFulfillable_quantity() {
        return fulfillable_quantity;
    }

    public void setFulfillable_quantity(Integer fulfillable_quantity) {
        this.fulfillable_quantity = fulfillable_quantity;
    }

    public String getFulfillment_service() {
        return fulfillment_service;
    }

    public void setFulfillment_service(String fulfillment_service) {
        this.fulfillment_service = fulfillment_service;
    }

    public String getFulfillment_status() {
        return fulfillment_status;
    }

    public void setFulfillment_status(String fulfillment_status) {
        this.fulfillment_status = fulfillment_status;
    }

    public Integer getGrams() {
        return grams;
    }

    public void setGrams(Integer grams) {
        this.grams = grams;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCurrent_quantity() {
        return current_quantity;
    }

    public void setCurrent_quantity(Integer current_quantity) {
        this.current_quantity = current_quantity;
    }

    public Boolean getRequires_shipping() {
        return requires_shipping;
    }

    public void setRequires_shipping(Boolean requires_shipping) {
        this.requires_shipping = requires_shipping;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getVariant_id() {
        return variant_id;
    }

    public void setVariant_id(Long variant_id) {
        this.variant_id = variant_id;
    }

    public String getVariant_title() {
        return variant_title;
    }

    public void setVariant_title(String variant_title) {
        this.variant_title = variant_title;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGift_card() {
        return gift_card;
    }

    public void setGift_card(Boolean gift_card) {
        this.gift_card = gift_card;
    }

    public MoneySet getPrice_set() {
        return price_set;
    }

    public void setPrice_set(MoneySet price_set) {
        this.price_set = price_set;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public Boolean getTaxable() {
        return taxable;
    }

    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    public List<TaxLine> getTax_lines() {
        return tax_lines;
    }

    public void setTax_lines(List<TaxLine> tax_lines) {
        this.tax_lines = tax_lines;
    }

    public String getTotal_discount() {
        return total_discount;
    }

    public void setTotal_discount(String total_discount) {
        this.total_discount = total_discount;
    }

    public MoneySet getTotal_discount_set() {
        return total_discount_set;
    }

    public void setTotal_discount_set(MoneySet total_discount_set) {
        this.total_discount_set = total_discount_set;
    }

    public List<DiscountAllocation> getDiscount_allocations() {
        return discount_allocations;
    }

    public void setDiscount_allocations(List<DiscountAllocation> discount_allocations) {
        this.discount_allocations = discount_allocations;
    }

    public OriginLocation getOrigin_location() {
        return origin_location;
    }

    public void setOrigin_location(OriginLocation origin_location) {
        this.origin_location = origin_location;
    }

    public List<Duty> getDuties() {
        return duties;
    }

    public void setDuties(List<Duty> duties) {
        this.duties = duties;
    }
}
