package com.shopify.demo.model;

import java.util.List;

public class PaymentTerms {
    private Integer amount;
    private String currency;
    private String payment_terms_name;
    private String payment_terms_type;
    private Integer due_in_days;
    private List<PaymentSchedule> payment_schedules;

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

    public String getPayment_terms_name() {
        return payment_terms_name;
    }

    public void setPayment_terms_name(String payment_terms_name) {
        this.payment_terms_name = payment_terms_name;
    }

    public String getPayment_terms_type() {
        return payment_terms_type;
    }

    public void setPayment_terms_type(String payment_terms_type) {
        this.payment_terms_type = payment_terms_type;
    }

    public Integer getDue_in_days() {
        return due_in_days;
    }

    public void setDue_in_days(Integer due_in_days) {
        this.due_in_days = due_in_days;
    }

    public List<PaymentSchedule> getPayment_schedules() {
        return payment_schedules;
    }

    public void setPayment_schedules(List<PaymentSchedule> payment_schedules) {
        this.payment_schedules = payment_schedules;
    }
}
