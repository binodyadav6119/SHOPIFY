package com.shopify.demo.indexes;

import com.shopify.demo.model.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import java.util.List;

@Data
@Document(indexName = "orders")
public class Order {
        @Id
        private Long id;
        private String tenantId;


        private String tax_exempt;
        private String reference;
        private String landing_site_ref;
        private String device_id;
        private String admin_graphql_api_id;
        private String checkout_id;




        private Long app_id;
        private BillingAddress billing_address;
        private String browser_ip;
        private Boolean buyer_accepts_marketing;
        private String cancel_reason;
        private String cancelled_at;
        private String cart_token;
        private String checkout_token;
        private ClientDetails client_details;
        private String closed_at;
        private Company company;
        private String confirmation_number;
        private Boolean confirmed;
        private String created_at;
        private String currency;
        private MoneySet current_total_additional_fees_set;
        private String current_total_discounts;
        private MoneySet current_total_discounts_set;
        private Current_total_duties_set current_total_duties_set;
        private String current_total_price;
        private MoneySet current_total_price_set;
        private String current_subtotal_price;
        private MoneySet current_subtotal_price_set;
        private String current_total_tax;
        private MoneySet current_total_tax_set;
        private Customer customer;
        private String customer_locale;
        private List<DiscountApplication> discount_applications;
        private List<DiscountCode> discount_codes;
        private String email;
        private Boolean estimated_taxes;
        private String financial_status;
        private List<Fulfillment> fulfillments;
        private String fulfillment_status;
        private String gateway;
        private String landing_site;
        private List<LineItem> line_items;
        private Long location_id;
        private Long merchant_of_record_app_id;
        private String name;
        private String note;
        private List<NoteAttribute> note_attributes;
        private Integer number;
        private Integer order_number;
        private MoneySet original_total_additional_fees_set;
        public Original_total_duties_set original_total_duties_set;
        private PaymentTerms payment_terms;
        private List<String> payment_gateway_names;
        private String phone;
        private String po_number;
        private String presentment_currency;
        private String processed_at;
        private String referring_site;
        private List<Refund> refunds;
        private Address shipping_address;
        private List<ShippingLine> shipping_lines;
        private String source_name;
        private String source_identifier;
        private String source_url;
        private String subtotal_price;
        private MoneySet subtotal_price_set;
        private String tags;
        private List<TaxLine> tax_lines;
        private Boolean taxes_included;
        private Boolean test;
        private String token;
        private String total_discounts;
        private MoneySet total_discounts_set;
        private String total_line_items_price;
        private MoneySet total_line_items_price_set;
        private String total_outstanding;
        private String total_price;
        private MoneySet total_price_set;
        private MoneySet total_shipping_price_set;
        private String total_tax;
        private MoneySet total_tax_set;
        private String total_tip_received;
        private Integer total_weight;
        private String updated_at;
        private Long user_id;
        private OrderStatusUrl order_status_url;

    public String getTax_exempt() {
        return tax_exempt;
    }

    public void setTax_exempt(String tax_exempt) {
        this.tax_exempt = tax_exempt;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLanding_site_ref() {
        return landing_site_ref;
    }

    public void setLanding_site_ref(String landing_site_ref) {
        this.landing_site_ref = landing_site_ref;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getAdmin_graphql_api_id() {
        return admin_graphql_api_id;
    }

    public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
        this.admin_graphql_api_id = admin_graphql_api_id;
    }

    public String getCheckout_id() {
        return checkout_id;
    }

    public void setCheckout_id(String checkout_id) {
        this.checkout_id = checkout_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Long getApp_id() {
        return app_id;
    }

    public void setApp_id(Long app_id) {
        this.app_id = app_id;
    }

    public BillingAddress getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(BillingAddress billing_address) {
        this.billing_address = billing_address;
    }

    public String getBrowser_ip() {
        return browser_ip;
    }

    public void setBrowser_ip(String browser_ip) {
        this.browser_ip = browser_ip;
    }

    public Boolean getBuyer_accepts_marketing() {
        return buyer_accepts_marketing;
    }

    public void setBuyer_accepts_marketing(Boolean buyer_accepts_marketing) {
        this.buyer_accepts_marketing = buyer_accepts_marketing;
    }

    public String getCancel_reason() {
        return cancel_reason;
    }

    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }

    public String getCancelled_at() {
        return cancelled_at;
    }

    public void setCancelled_at(String cancelled_at) {
        this.cancelled_at = cancelled_at;
    }

    public String getCart_token() {
        return cart_token;
    }

    public void setCart_token(String cart_token) {
        this.cart_token = cart_token;
    }

    public String getCheckout_token() {
        return checkout_token;
    }

    public void setCheckout_token(String checkout_token) {
        this.checkout_token = checkout_token;
    }

    public ClientDetails getClient_details() {
        return client_details;
    }

    public void setClient_details(ClientDetails client_details) {
        this.client_details = client_details;
    }

    public String getClosed_at() {
        return closed_at;
    }

    public void setClosed_at(String closed_at) {
        this.closed_at = closed_at;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getConfirmation_number() {
        return confirmation_number;
    }

    public void setConfirmation_number(String confirmation_number) {
        this.confirmation_number = confirmation_number;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public MoneySet getCurrent_total_additional_fees_set() {
        return current_total_additional_fees_set;
    }

    public void setCurrent_total_additional_fees_set(MoneySet current_total_additional_fees_set) {
        this.current_total_additional_fees_set = current_total_additional_fees_set;
    }

    public String getCurrent_total_discounts() {
        return current_total_discounts;
    }

    public void setCurrent_total_discounts(String current_total_discounts) {
        this.current_total_discounts = current_total_discounts;
    }





    public String getCurrent_total_price() {
        return current_total_price;
    }

    public void setCurrent_total_price(String current_total_price) {
        this.current_total_price = current_total_price;
    }



    public String getCurrent_subtotal_price() {
        return current_subtotal_price;
    }

    public void setCurrent_subtotal_price(String current_subtotal_price) {
        this.current_subtotal_price = current_subtotal_price;
    }


    public String getCurrent_total_tax() {
        return current_total_tax;
    }

    public void setCurrent_total_tax(String current_total_tax) {
        this.current_total_tax = current_total_tax;
    }

    public MoneySet getCurrent_total_tax_set() {
        return current_total_tax_set;
    }

    public void setCurrent_total_tax_set(MoneySet current_total_tax_set) {
        this.current_total_tax_set = current_total_tax_set;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCustomer_locale() {
        return customer_locale;
    }

    public void setCustomer_locale(String customer_locale) {
        this.customer_locale = customer_locale;
    }

    public List<DiscountApplication> getDiscount_applications() {
        return discount_applications;
    }

    public void setDiscount_applications(List<DiscountApplication> discount_applications) {
        this.discount_applications = discount_applications;
    }

    public List<DiscountCode> getDiscount_codes() {
        return discount_codes;
    }

    public void setDiscount_codes(List<DiscountCode> discount_codes) {
        this.discount_codes = discount_codes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEstimated_taxes() {
        return estimated_taxes;
    }

    public void setEstimated_taxes(Boolean estimated_taxes) {
        this.estimated_taxes = estimated_taxes;
    }

    public String getFinancial_status() {
        return financial_status;
    }

    public void setFinancial_status(String financial_status) {
        this.financial_status = financial_status;
    }

    public List<Fulfillment> getFulfillments() {
        return fulfillments;
    }

    public void setFulfillments(List<Fulfillment> fulfillments) {
        this.fulfillments = fulfillments;
    }

    public String getFulfillment_status() {
        return fulfillment_status;
    }

    public void setFulfillment_status(String fulfillment_status) {
        this.fulfillment_status = fulfillment_status;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getLanding_site() {
        return landing_site;
    }

    public void setLanding_site(String landing_site) {
        this.landing_site = landing_site;
    }

    public List<LineItem> getLine_items() {
        return line_items;
    }

    public void setLine_items(List<LineItem> line_items) {
        this.line_items = line_items;
    }

    public Long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Long location_id) {
        this.location_id = location_id;
    }

    public Long getMerchant_of_record_app_id() {
        return merchant_of_record_app_id;
    }

    public void setMerchant_of_record_app_id(Long merchant_of_record_app_id) {
        this.merchant_of_record_app_id = merchant_of_record_app_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<NoteAttribute> getNote_attributes() {
        return note_attributes;
    }

    public void setNote_attributes(List<NoteAttribute> note_attributes) {
        this.note_attributes = note_attributes;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getOrder_number() {
        return order_number;
    }

    public void setOrder_number(Integer order_number) {
        this.order_number = order_number;
    }

    public MoneySet getOriginal_total_additional_fees_set() {
        return original_total_additional_fees_set;
    }

    public void setOriginal_total_additional_fees_set(MoneySet original_total_additional_fees_set) {
        this.original_total_additional_fees_set = original_total_additional_fees_set;
    }

    public MoneySet getCurrent_total_discounts_set() {
        return current_total_discounts_set;
    }

    public void setCurrent_total_discounts_set(MoneySet current_total_discounts_set) {
        this.current_total_discounts_set = current_total_discounts_set;
    }

    public Current_total_duties_set getCurrent_total_duties_set() {
        return current_total_duties_set;
    }

    public void setCurrent_total_duties_set(Current_total_duties_set current_total_duties_set) {
        this.current_total_duties_set = current_total_duties_set;
    }

    public MoneySet getCurrent_total_price_set() {
        return current_total_price_set;
    }

    public void setCurrent_total_price_set(MoneySet current_total_price_set) {
        this.current_total_price_set = current_total_price_set;
    }

    public MoneySet getCurrent_subtotal_price_set() {
        return current_subtotal_price_set;
    }

    public void setCurrent_subtotal_price_set(MoneySet current_subtotal_price_set) {
        this.current_subtotal_price_set = current_subtotal_price_set;
    }

    public Original_total_duties_set getOriginal_total_duties_set() {
        return original_total_duties_set;
    }

    public void setOriginal_total_duties_set(Original_total_duties_set original_total_duties_set) {
        this.original_total_duties_set = original_total_duties_set;
    }

    public PaymentTerms getPayment_terms() {
        return payment_terms;
    }

    public void setPayment_terms(PaymentTerms payment_terms) {
        this.payment_terms = payment_terms;
    }

    public List<String> getPayment_gateway_names() {
        return payment_gateway_names;
    }

    public void setPayment_gateway_names(List<String> payment_gateway_names) {
        this.payment_gateway_names = payment_gateway_names;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPo_number() {
        return po_number;
    }

    public void setPo_number(String po_number) {
        this.po_number = po_number;
    }

    public String getPresentment_currency() {
        return presentment_currency;
    }

    public void setPresentment_currency(String presentment_currency) {
        this.presentment_currency = presentment_currency;
    }

    public String getProcessed_at() {
        return processed_at;
    }

    public void setProcessed_at(String processed_at) {
        this.processed_at = processed_at;
    }

    public String getReferring_site() {
        return referring_site;
    }

    public void setReferring_site(String referring_site) {
        this.referring_site = referring_site;
    }

    public List<Refund> getRefunds() {
        return refunds;
    }

    public void setRefunds(List<Refund> refunds) {
        this.refunds = refunds;
    }

    public Address getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(Address shipping_address) {
        this.shipping_address = shipping_address;
    }

    public List<ShippingLine> getShipping_lines() {
        return shipping_lines;
    }

    public void setShipping_lines(List<ShippingLine> shipping_lines) {
        this.shipping_lines = shipping_lines;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getSource_identifier() {
        return source_identifier;
    }

    public void setSource_identifier(String source_identifier) {
        this.source_identifier = source_identifier;
    }

    public String getSource_url() {
        return source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    public String getSubtotal_price() {
        return subtotal_price;
    }

    public void setSubtotal_price(String subtotal_price) {
        this.subtotal_price = subtotal_price;
    }

    public MoneySet getSubtotal_price_set() {
        return subtotal_price_set;
    }

    public void setSubtotal_price_set(MoneySet subtotal_price_set) {
        this.subtotal_price_set = subtotal_price_set;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public List<TaxLine> getTax_lines() {
        return tax_lines;
    }

    public void setTax_lines(List<TaxLine> tax_lines) {
        this.tax_lines = tax_lines;
    }

    public Boolean getTaxes_included() {
        return taxes_included;
    }

    public void setTaxes_included(Boolean taxes_included) {
        this.taxes_included = taxes_included;
    }

    public Boolean getTest() {
        return test;
    }

    public void setTest(Boolean test) {
        this.test = test;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTotal_discounts() {
        return total_discounts;
    }

    public void setTotal_discounts(String total_discounts) {
        this.total_discounts = total_discounts;
    }

    public MoneySet getTotal_discounts_set() {
        return total_discounts_set;
    }

    public void setTotal_discounts_set(MoneySet total_discounts_set) {
        this.total_discounts_set = total_discounts_set;
    }

    public String getTotal_line_items_price() {
        return total_line_items_price;
    }

    public void setTotal_line_items_price(String total_line_items_price) {
        this.total_line_items_price = total_line_items_price;
    }

    public MoneySet getTotal_line_items_price_set() {
        return total_line_items_price_set;
    }

    public void setTotal_line_items_price_set(MoneySet total_line_items_price_set) {
        this.total_line_items_price_set = total_line_items_price_set;
    }

    public String getTotal_outstanding() {
        return total_outstanding;
    }

    public void setTotal_outstanding(String total_outstanding) {
        this.total_outstanding = total_outstanding;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public MoneySet getTotal_price_set() {
        return total_price_set;
    }

    public void setTotal_price_set(MoneySet total_price_set) {
        this.total_price_set = total_price_set;
    }

    public MoneySet getTotal_shipping_price_set() {
        return total_shipping_price_set;
    }

    public void setTotal_shipping_price_set(MoneySet total_shipping_price_set) {
        this.total_shipping_price_set = total_shipping_price_set;
    }

    public String getTotal_tax() {
        return total_tax;
    }

    public void setTotal_tax(String total_tax) {
        this.total_tax = total_tax;
    }

    public MoneySet getTotal_tax_set() {
        return total_tax_set;
    }

    public void setTotal_tax_set(MoneySet total_tax_set) {
        this.total_tax_set = total_tax_set;
    }

    public String getTotal_tip_received() {
        return total_tip_received;
    }

    public void setTotal_tip_received(String total_tip_received) {
        this.total_tip_received = total_tip_received;
    }

    public Integer getTotal_weight() {
        return total_weight;
    }

    public void setTotal_weight(Integer total_weight) {
        this.total_weight = total_weight;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public OrderStatusUrl getOrder_status_url() {
        return order_status_url;
    }

    public void setOrder_status_url(OrderStatusUrl order_status_url) {
        this.order_status_url = order_status_url;
    }




}