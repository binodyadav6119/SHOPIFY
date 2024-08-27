package com.shopify.demo.model;

public class PaymentSchedule {
    private Integer amount;
    private String currency;
    private String issued_at;
    private String due_at;
    private String completed_at;
    private String expected_payment_method;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIssued_at() {
        return issued_at;
    }

    public void setIssued_at(String issued_at) {
        this.issued_at = issued_at;
    }

    public String getDue_at() {
        return due_at;
    }

    public void setDue_at(String due_at) {
        this.due_at = due_at;
    }

    public String getCompleted_at() {
        return completed_at;
    }

    public void setCompleted_at(String completed_at) {
        this.completed_at = completed_at;
    }

    public String getExpected_payment_method() {
        return expected_payment_method;
    }

    public void setExpected_payment_method(String expected_payment_method) {
        this.expected_payment_method = expected_payment_method;
    }
}
