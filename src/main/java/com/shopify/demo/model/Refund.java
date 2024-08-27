package com.shopify.demo.model;

import java.util.List;

public class Refund {
    private Long id;
    private Long order_id;
    private String created_at;
    private String note;
    private Long user_id;
    private String processed_at;
    private List<Object> refund_line_items;
    private List<Object> transactions;
    private List<Object> order_adjustments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getProcessed_at() {
        return processed_at;
    }

    public void setProcessed_at(String processed_at) {
        this.processed_at = processed_at;
    }

    public List<Object> getRefund_line_items() {
        return refund_line_items;
    }

    public void setRefund_line_items(List<Object> refund_line_items) {
        this.refund_line_items = refund_line_items;
    }

    public List<Object> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Object> transactions) {
        this.transactions = transactions;
    }

    public List<Object> getOrder_adjustments() {
        return order_adjustments;
    }

    public void setOrder_adjustments(List<Object> order_adjustments) {
        this.order_adjustments = order_adjustments;
    }
}
