package com.supplycart.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItemsRequest {
    private Integer orderId;
    private String skuCode;
    private BigDecimal orderPrice;
    private Integer orderQuantity;
}
