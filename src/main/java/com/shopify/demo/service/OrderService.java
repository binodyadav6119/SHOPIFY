package com.shopify.demo.service;


import com.shopify.demo.indexes.Order;
import com.shopify.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Mono<Order> saveOrder(Order order, String tenantId) {
        order.setTenantId(tenantId);
        if(order.getId()==null)
            order.setId(System.currentTimeMillis());
        return orderRepository.save(order);

    }

    public Flux<Order> getOrdersForTenant(String tenantId) {
        return orderRepository.findByTenantId(tenantId);
    }

    public Mono<Order> getOrderById(Long id, String tenantId) {
        return orderRepository.findById(id)
                .filter(order -> tenantId.equals(order.getTenantId()));
    }

    public Flux<Order> getAllOrders(String tenantId) {
        return orderRepository.findByTenantId(tenantId);
    }

    public Mono<Void> deleteOrderById(Long id, String tenantId) {
        return orderRepository.findById(id)
                .filter(order -> tenantId.equals(order.getTenantId()))
                .flatMap(order -> orderRepository.deleteById(id));
    }
}
