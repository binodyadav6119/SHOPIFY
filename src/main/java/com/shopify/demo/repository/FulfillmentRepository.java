//package com.shopify.demo.fulfillment.repository;
//
//import com.shopify.demo.indexes.Fulfillment;
//import com.shopify.demo.indexes.Order;
//import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
//import reactor.core.publisher.Flux;
//
//public interface FulfillmentRepository extends ReactiveElasticsearchRepository<Fulfillment,Long> {
//    Flux<Fulfillment> findByTenantId(String tenantId);
//}
//
//

package com.shopify.demo.repository;

import com.shopify.demo.indexes.Fulfillment;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Repository
public interface FulfillmentRepository extends ReactiveElasticsearchRepository<Fulfillment, Long> {
    Flux<Fulfillment> findByTenantId(String tenantId);

    @Query("{\"bool\": {\"must\": [{\"term\": {\"id\": \"?0\"}}, {\"term\": {\"order_id\": \"?1\"}}, {\"term\": {\"tenantId\": \"?2\"}}]}}")
    Mono<Fulfillment> findByIdAndOrder_idAndTenantId(String id, String order_id, String tenantId);

}

