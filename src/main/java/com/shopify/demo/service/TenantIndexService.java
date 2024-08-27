package com.shopify.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TenantIndexService {

    // This method generates an index name based on the tenant ID
    public String getIndexName(String tenantId) {
        return "orders_" + tenantId.toLowerCase();
    }
}

