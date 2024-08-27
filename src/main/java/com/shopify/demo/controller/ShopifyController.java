package com.shopify.demo.controller;


import com.shopify.demo.service.ShopifyService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/shopify")
public class ShopifyController {

    private final ShopifyService shopifyService;

    public ShopifyController(ShopifyService shopifyService) {
        this.shopifyService = shopifyService;
    }

    @GetMapping("/orders/{orderId}/fulfillments/count")
    public Mono<String> getFulfillmentCount(@PathVariable Long orderId)
    {
        return shopifyService.getFulfillmentCount(orderId);
    }

    @GetMapping("/orders/{orderId}/fulfillments/{fulfillmentId}")
    public Mono<String> getFulfillmentDetails(@PathVariable Long orderId,
                                              @PathVariable Long fulfillmentId
                                              ) {
        return shopifyService.getFulfillmentDetails(orderId, fulfillmentId);
    }

    @GetMapping("/orders/{orderId}/fulfillments")
    public Mono<String> getAllFulfillmentDetails(@PathVariable Long orderId)
    {
        return shopifyService.getAllFulfillmentDetails(orderId);
    }

    @GetMapping("/orders/count")
    public Mono<String> getOrderCount() {
        return shopifyService.getOrderCount();
    }

    @GetMapping("/orders/{orderId}")
    public Mono<String> getOrderDetails(@PathVariable Long orderId) {
        return shopifyService.getOrderDetails(orderId);
    }
    @GetMapping("/orders")
    public Mono<String> getAllOrderDetails() {
        return shopifyService.getAllOrderDetails();
    }

    @PostMapping("/orders/open")
    public Mono<String> openOrder(@RequestParam Long orderId) {
        return shopifyService.openOrder(orderId);
    }

    @PostMapping("/orders/close")
    public Mono<String> closeOrder(@RequestParam Long orderId) {
        return shopifyService.closeOrder(orderId);
    }

    @PostMapping("/orders/cancel")
    public Mono<String> cancelOrder(@RequestParam Long orderId) {
        return shopifyService.cancelOrder(orderId);
    }

    @PostMapping("/orders/create")
    public Mono<String> createOrder(@RequestBody String orderPayload) {
        return shopifyService.createOrder( orderPayload);
    }

    @DeleteMapping("/orders/delete")
    public Mono<String> deleteOrder(@RequestParam Long orderId) {
        return shopifyService.deleteOrder(orderId);
    }
}
