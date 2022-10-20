package com.supplycart.orderservice.controller;

import com.supplycart.orderservice.dto.OrderRequest;
import com.supplycart.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        System.out.println("****Controller***");
        System.out.println(orderRequest);
        return orderService.placeOrder(orderRequest);

    }
}
