package com.shopify.demo.model;

public class TaxLine {
    private Double price;
    private Double rate;
    private String title;
    private Boolean channel_liable;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getChannel_liable() {
        return channel_liable;
    }

    public void setChannel_liable(Boolean channel_liable) {
        this.channel_liable = channel_liable;
    }
}
