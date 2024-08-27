package com.shopify.demo.service;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ShopifyService {
    @Value("${shopify.base.url}")
    private String shopifyUrl;

    @Value("${shopify.token}")
    private String shopifyToken;



    public Mono<String> getFulfillmentCount(Long orderId) {
        WebClient webClient = WebClient.builder()
                .baseUrl(shopifyUrl+"/admin/api/2024-04")
                .build();

        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/orders/{orderId}/fulfillments/count.json")
                        .build(orderId))
                .header("X-Shopify-Access-Token", shopifyToken)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class); // Return raw response as String
    }
    public Mono<String> getFulfillmentDetails(Long orderId, Long fulfillmentId) {
        WebClient webClient = WebClient.builder()
                .baseUrl(shopifyUrl+"/admin/api/2024-04")
                .build();
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/orders/{orderId}/fulfillments/{fulfillmentId}.json")
                        .build(orderId, fulfillmentId))
                .header("X-Shopify-Access-Token", shopifyToken)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class); // Return raw response as String
    }
    public Mono<String> getAllFulfillmentDetails(Long orderId) {
        WebClient webClient = WebClient.builder()
                .baseUrl(shopifyUrl+"/admin/api/2024-04")
                .build();
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/orders/{orderId}/fulfillments.json")
                        .build(orderId))
                .header("X-Shopify-Access-Token", shopifyToken)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class); // Return raw response as String
    }

    public Mono<String> getOrderCount() {
        WebClient webClient = WebClient.builder()
                .baseUrl(shopifyUrl+"/admin/api/2024-04")
                .build();
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/orders/count.json")
                        .queryParam("status", "any")
                        .build())
                .header("X-Shopify-Access-Token", shopifyToken)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class); // Return raw response as String
    }
    public Mono<String> getOrderDetails(Long id) {
        WebClient webClient = WebClient.builder()
                .baseUrl(shopifyUrl+"/admin/api/2024-04")
                .build();
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/orders/"+id+".json")
                        .queryParam("status", "any")
                        .build())
                .header("X-Shopify-Access-Token", shopifyToken)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class); // Return raw response as String
    }
    public Mono<String> getAllOrderDetails() {
        WebClient webClient = WebClient.builder()
                .baseUrl(shopifyUrl + "/admin/api/2024-04")
                .exchangeStrategies(ExchangeStrategies.builder()
                        .codecs(configurer -> configurer
                                .defaultCodecs()
                                .maxInMemorySize(10 * 1024 * 1024)) // Set max size to 10 MB
                        .build())
                .build();

        // Make the request
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/orders.json")
                        .queryParam("status", "any")
                        .build())
                .header("X-Shopify-Access-Token", shopifyToken)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> openOrder(Long orderId) {
        WebClient webClient = WebClient.builder()
                .baseUrl(shopifyUrl+"/admin/api/2024-04")
                .build();
        return webClient.post()
                .uri(uriBuilder -> uriBuilder.path("/orders/{orderId}/open.json")
                        .build(orderId))
                .header("X-Shopify-Access-Token", shopifyToken)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .bodyValue("{}")  // Empty JSON payload
                .retrieve()
                .bodyToMono(String.class); // Return raw response as String
    }

    public Mono<String> closeOrder(Long orderId) {
        WebClient webClient = WebClient.builder()
                .baseUrl(shopifyUrl+"/admin/api/2024-04")
                .build();
        return webClient.post()
                .uri(uriBuilder -> uriBuilder.path("/orders/{orderId}/close.json")
                        .build(orderId))
                .header("X-Shopify-Access-Token", shopifyToken)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .bodyValue("{}")  // Empty JSON payload
                .retrieve()
                .bodyToMono(String.class); // Return raw response as String
    }

    public Mono<String> cancelOrder(Long orderId) {
        WebClient webClient = WebClient.builder()
                .baseUrl(shopifyUrl+"/admin/api/2024-04")
                .build();
        return webClient.post()
                .uri(uriBuilder -> uriBuilder.path("/orders/{orderId}/cancel.json")
                        .build(orderId))
                .header("X-Shopify-Access-Token", shopifyToken)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .bodyValue("{}")  // Empty JSON payload
                .retrieve()
                .bodyToMono(String.class); // Return raw response as String
    }

    public Mono<String> createOrder(String orderPayload) {
        WebClient webClient = WebClient.builder()
                .baseUrl(shopifyUrl+"/admin/api/2024-04")
                .build();
        return webClient.post()
                .uri("/orders.json")
                .header("X-Shopify-Access-Token", shopifyToken)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .bodyValue(orderPayload)
                .retrieve()
                .bodyToMono(String.class); // Return raw response as String
    }

    public Mono<String> deleteOrder(Long orderId) {
        WebClient webClient = WebClient.builder()
                .baseUrl(shopifyUrl) // Set the base URL here
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader("X-Shopify-Access-Token", shopifyToken)
                .build();

        return webClient.delete()
                .uri(uriBuilder -> uriBuilder.path("/admin/api/2024-04/orders/{orderId}.json")
                        .build(orderId))
                .retrieve()
                .bodyToMono(String.class);
    }

}
