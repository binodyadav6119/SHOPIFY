package com.shopify.demo.model;

public class ClientDetails {
    private String accept_language;
    private Integer browser_height;
    private String browser_ip;
    private Integer browser_width;
    private String session_hash;
    private String user_agent;

    public String getAccept_language() {
        return accept_language;
    }

    public void setAccept_language(String accept_language) {
        this.accept_language = accept_language;
    }

    public Integer getBrowser_height() {
        return browser_height;
    }

    public void setBrowser_height(Integer browser_height) {
        this.browser_height = browser_height;
    }

    public String getBrowser_ip() {
        return browser_ip;
    }

    public void setBrowser_ip(String browser_ip) {
        this.browser_ip = browser_ip;
    }

    public Integer getBrowser_width() {
        return browser_width;
    }

    public void setBrowser_width(Integer browser_width) {
        this.browser_width = browser_width;
    }

    public String getSession_hash() {
        return session_hash;
    }

    public void setSession_hash(String session_hash) {
        this.session_hash = session_hash;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }
}
