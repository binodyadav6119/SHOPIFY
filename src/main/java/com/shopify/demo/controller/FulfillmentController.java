

package com.shopify.demo.controller;

import com.shopify.demo.indexes.Fulfillment;
import com.shopify.demo.service.FulfillmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/fulfillments")
public class FulfillmentController {

    @Autowired
    private FulfillmentService fulfillmentService;

    @PostMapping("/{tenantId}")
    public Mono<Fulfillment> createFulfillment(@PathVariable String tenantId, @RequestBody Fulfillment fulfillment) {
        return fulfillmentService.saveFulfillment(fulfillment, tenantId);
    }

    @PostMapping("/cancel/{tenantId}/{id}")
    public Mono<Fulfillment> cancelFulfillment(@PathVariable String tenantId, @PathVariable Long id) {
        return fulfillmentService.cancelFulfillmentById(tenantId, id);
    }

    @PostMapping("/update/{tenantId}/{id}")
    public Mono<Fulfillment> updateFulfillment(@PathVariable String tenantId, @PathVariable Long id,@RequestBody Fulfillment fulfillment) {
        return fulfillmentService.updateFulfillmentById(tenantId, id, fulfillment);
    }

    @GetMapping("/{tenantId}/{id}")
    public Mono<Fulfillment> getFulfillment(@PathVariable String tenantId, @PathVariable Long id) {
        return fulfillmentService.getFulfillmentById(id, tenantId);
    }

    @GetMapping("/{tenantId}/{id}/{orderId}")
    public Mono<Fulfillment> getFulfillmentByOrderId(@PathVariable String tenantId, @PathVariable Long id,@PathVariable Long orderId) {
        return fulfillmentService.getFulfillmentByOrderId(tenantId,id,orderId);
    }

    @GetMapping("/{tenantId}")
    public Flux<Fulfillment> getAllFulfillment(@PathVariable String tenantId) {
        return fulfillmentService.getAllFulfillment(tenantId);
    }

    @DeleteMapping("/{tenantId}/{id}")
    public Mono<Void> deleteOrder(@PathVariable String tenantId, @PathVariable Long id) {
        return fulfillmentService.deleteOrderById(id, tenantId);
    }
}
