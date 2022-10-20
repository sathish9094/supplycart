package com.supplycart.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="order-item-table")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private String skuCode;
    private BigDecimal orderPrice;
    private Integer orderQuantity;
}
