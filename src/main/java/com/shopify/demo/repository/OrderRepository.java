package com.shopify.demo.repository;

//import com.shopify.demo.indexes.Order;
//import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface OrderRepository extends ReactiveElasticsearchRepository<Order, String> {
//}


import com.shopify.demo.indexes.Order;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import reactor.core.publisher.Flux;

public interface OrderRepository extends ReactiveElasticsearchRepository<Order, Long> {
    Flux<Order> findByTenantId(String tenantId);
}