package com.shopify.demo.model;

import java.util.List;
import java.util.Map;

public class Customer {
    private Long id;
    private String email;
    private Boolean accepts_marketing;
    private String created_at;
    private String updated_at;
    private String first_name;
    private String last_name;
    private String state;
    private String note;
    private Boolean verified_email;
    private String multipass_identifier;
    private Boolean tax_exempt;
    //            private Map<String, Object> tax_exemptions;
    private String phone;
    private String tags;
    private String currency;
    private List<String> tax_exemptions;
    private Object email_marketing_consent;
    private String sms_marketing_consent;
    private Map<String, Object> addresses;
    private String admin_graphql_api_id;
    private Map<String, Object> default_address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAccepts_marketing() {
        return accepts_marketing;
    }

    public void setAccepts_marketing(Boolean accepts_marketing) {
        this.accepts_marketing = accepts_marketing;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getVerified_email() {
        return verified_email;
    }

    public void setVerified_email(Boolean verified_email) {
        this.verified_email = verified_email;
    }

    public String getMultipass_identifier() {
        return multipass_identifier;
    }

    public void setMultipass_identifier(String multipass_identifier) {
        this.multipass_identifier = multipass_identifier;
    }

    public Boolean getTax_exempt() {
        return tax_exempt;
    }

    public void setTax_exempt(Boolean tax_exempt) {
        this.tax_exempt = tax_exempt;
    }

    public List<String> getTax_exemptions() {
        return tax_exemptions;
    }

    public void setTax_exemptions(List<String> tax_exemptions) {
        this.tax_exemptions = tax_exemptions;
    }

    public Object getEmail_marketing_consent() {
        return email_marketing_consent;
    }

    public void setEmail_marketing_consent(Object email_marketing_consent) {
        this.email_marketing_consent = email_marketing_consent;
    }

    public String getSms_marketing_consent() {
        return sms_marketing_consent;
    }

    public void setSms_marketing_consent(String sms_marketing_consent) {
        this.sms_marketing_consent = sms_marketing_consent;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Map<String, Object> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, Object> addresses) {
        this.addresses = addresses;
    }

    public String getAdmin_graphql_api_id() {
        return admin_graphql_api_id;
    }

    public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
        this.admin_graphql_api_id = admin_graphql_api_id;
    }

    public Map<String, Object> getDefault_address() {
        return default_address;
    }

    public void setDefault_address(Map<String, Object> default_address) {
        this.default_address = default_address;
    }
}
