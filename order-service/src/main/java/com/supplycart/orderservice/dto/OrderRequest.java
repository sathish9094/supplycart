package com.supplycart.orderservice.dto;

import com.supplycart.orderservice.model.OrderItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequest {
    private List<OrderItemsRequest> orderItemsList;
}
