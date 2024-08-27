package com.shopify.demo.controller;

import com.shopify.demo.indexes.Order;
import com.shopify.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/test")
    public String test() {
        return "testing apis";
    }

    @PostMapping("/{tenantId}")
    public Mono<Order> createOrder(@PathVariable String tenantId, @RequestBody Order order) {
        return orderService.saveOrder(order, tenantId);
    }

    @GetMapping("/{tenantId}/{id}")
    public Mono<Order> getOrder(@PathVariable String tenantId, @PathVariable Long id) {
        return orderService.getOrderById(id, tenantId);
    }

    @GetMapping("/{tenantId}")
    public Flux<Order> getAllOrders(@PathVariable String tenantId) {
        return orderService.getAllOrders(tenantId);
    }

    @DeleteMapping("/{tenantId}/{id}")
    public Mono<Void> deleteOrder(@PathVariable String tenantId, @PathVariable Long id) {
        return orderService.deleteOrderById(id, tenantId);
    }
}
