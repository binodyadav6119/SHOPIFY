package com.shopify.demo.indexes;



import com.shopify.demo.model.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import java.util.List;

@Data
@Document(indexName = "fulfillment")
public class Fulfillment {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incremental-generator")
        @SequenceGenerator(name = "incremental-generator", sequenceName = "incremental_seq", allocationSize = 1)
        private Long id;


        private String created_at;
        private List<LineItem> line_items;
        private String tenantId;
        private long location_id;
        private String name;
        private long order_id;
        private Address origin_address;
        private Receipt receipt;
        private String service;
        private String shipment_status;
        private String status;
        private String tracking_company;
        private List<String> tracking_numbers;
        private String tracking_number;
        private List<String> tracking_urls;
        private String tracking_url;
        private String updated_at;
        private String variant_inventory_management;
        private Object destination;
        private String admin_graphql_api_id;
        private Boolean notify_customer;
        private Object tracking_info;
        // Getters and setters for all fields


    public Boolean getNotify_customer() {
        return notify_customer;
    }

    public void setNotify_customer(Boolean notify_customer) {
        this.notify_customer = notify_customer;
    }

    public Object getTracking_info() {
        return tracking_info;
    }

    public void setTracking_info(Object tracking_info) {
        this.tracking_info = tracking_info;
    }

    public String getAdmin_graphql_api_id() {
        return admin_graphql_api_id;
    }

    public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
        this.admin_graphql_api_id = admin_graphql_api_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object getDestination() {
        return destination;
    }

    public void setDestination(Object destination) {
        this.destination = destination;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public List<LineItem> getLine_items() {
        return line_items;
    }

    public void setLine_items(List<LineItem> line_items) {
        this.line_items = line_items;
    }

    public long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(long location_id) {
        this.location_id = location_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public Address getOrigin_address() {
        return origin_address;
    }

    public void setOrigin_address(Address origin_address) {
        this.origin_address = origin_address;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getShipment_status() {
        return shipment_status;
    }

    public void setShipment_status(String shipment_status) {
        this.shipment_status = shipment_status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTracking_company() {
        return tracking_company;
    }

    public void setTracking_company(String tracking_company) {
        this.tracking_company = tracking_company;
    }

    public List<String> getTracking_numbers() {
        return tracking_numbers;
    }

    public void setTracking_numbers(List<String> tracking_numbers) {
        this.tracking_numbers = tracking_numbers;
    }

    public String getTracking_number() {
        return tracking_number;
    }

    public void setTracking_number(String tracking_number) {
        this.tracking_number = tracking_number;
    }

    public List<String> getTracking_urls() {
        return tracking_urls;
    }

    public void setTracking_urls(List<String> tracking_urls) {
        this.tracking_urls = tracking_urls;
    }

    public String getTracking_url() {
        return tracking_url;
    }

    public void setTracking_url(String tracking_url) {
        this.tracking_url = tracking_url;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getVariant_inventory_management() {
        return variant_inventory_management;
    }

    public void setVariant_inventory_management(String variant_inventory_management) {
        this.variant_inventory_management = variant_inventory_management;
    }

}

