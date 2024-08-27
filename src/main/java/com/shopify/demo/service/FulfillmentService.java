
package com.shopify.demo.service;

import com.shopify.demo.indexes.Fulfillment;
import com.shopify.demo.repository.FulfillmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FulfillmentService {

    @Autowired
    private FulfillmentRepository fulfillmentRepository;

    public Mono<Fulfillment> saveFulfillment(Fulfillment fulfillment, String tenantId) {
        fulfillment.setTenantId(tenantId);
        fulfillment.setId(System.currentTimeMillis()); // Assuming this generates a unique Long ID
        return fulfillmentRepository.save(fulfillment);
    }

    public Flux<Fulfillment> getFulfillmentsForTenant(String tenantId) {
        return fulfillmentRepository.findByTenantId(tenantId);
    }

    public Mono<Fulfillment> getFulfillmentById(Long id, String tenantId) {
        return fulfillmentRepository.findById(id)
                .filter(order -> tenantId.equals(order.getTenantId()));
    }

    public Flux<Fulfillment> getAllFulfillment(String tenantId) {
        return fulfillmentRepository.findByTenantId(tenantId);
    }

    public Mono<Void> deleteOrderById(Long id, String tenantId) {
        return fulfillmentRepository.findById(id)
                .filter(order -> tenantId.equals(order.getTenantId()))
                .flatMap(order -> fulfillmentRepository.deleteById(id));
    }

    public Mono<Fulfillment> cancelFulfillmentById(String tenantId, Long id) {
        return fulfillmentRepository.findById(id)
                .filter(order -> tenantId.equals(order.getTenantId()))
                .flatMap(order -> {
                    order.setStatus("cancel"); // Set status to "cancel"
                    return fulfillmentRepository.save(order); // Save updated order
                });
    }

    public Mono<Fulfillment> updateFulfillmentById(String tenantId, Long id, Fulfillment fulfillment) {
        return fulfillmentRepository.findById(id)
                .filter(order -> tenantId.equals(order.getTenantId()))
                .flatMap(order -> {
                    fulfillment.setId(id); // Ensure the ID of the provided fulfillment is set
                    return fulfillmentRepository.save(fulfillment); // Save updated fulfillment
                });
    }

    public Mono<Fulfillment> getFulfillmentByOrderId(String tenantId, Long fulfillmentId, Long order_id) {
        return fulfillmentRepository.findById(fulfillmentId)
                .filter(fulfillment -> tenantId.equals(fulfillment.getTenantId()) && order_id.equals(fulfillment.getOrder_id()));
    }
}
