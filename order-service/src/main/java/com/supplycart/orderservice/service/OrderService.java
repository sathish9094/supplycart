package com.supplycart.orderservice.service;

import com.supplycart.orderservice.dto.OrderItemsRequest;
import com.supplycart.orderservice.dto.OrderRequest;
import com.supplycart.orderservice.model.Order;
import com.supplycart.orderservice.model.OrderItems;
import com.supplycart.orderservice.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Builder
public class OrderService {
    private final OrderRepository orderRepository;

    public String placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        System.out.println("placeOrder start");
       // List<OrderItems> orderItems = orderRequest.getOrderItemsList();
        List<OrderItems> orderItems = orderRequest.getOrderItemsList().stream()
                        .map(this::mapToOrderItems).toList();
        System.out.println("placeOrder");
        System.out.println(orderItems);
        order.setOrderId(2);
        order.setOrderItems(orderItems);
        System.out.println("display order");
        System.out.println(order);


//        List<OrderItems> orderItemsList = orderRequest.getOrderItems().stream().
//                map(this::mapToOrderItems).toList();
        orderRepository.save(order);
        return "Order placed successfully";

    }

    private OrderItems mapToOrderItems(OrderItemsRequest orderItemsRequest) {
        OrderItems orderItems = new OrderItems();
        orderItems.setOrderId(orderItemsRequest.getOrderId());
        orderItems.setOrderQuantity(orderItemsRequest.getOrderQuantity());
        orderItems.setOrderPrice(orderItemsRequest.getOrderPrice());
        orderItems.setSkuCode(orderItemsRequest.getSkuCode());
        System.out.println("**&#$^$*$#");
        System.out.println(orderItemsRequest.getOrderQuantity());
        return orderItems;
    }
}
