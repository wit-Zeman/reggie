package com.toonyoo.reggie.pojo;

import java.math.BigDecimal;
import lombok.Data;

/**
 * Table: order_detail
 */
@Data
public class OrderDetail {
    /**
     * Column: id
     * Type: BIGINT
     * Remark: 主键
     */
    private Long id;

    /**
     * Column: name
     * Type: VARCHAR(50)
     * Remark: 名字
     */
    private String name;

    /**
     * Column: image
     * Type: VARCHAR(100)
     * Remark: 图片
     */
    private String image;

    /**
     * Column: order_id
     * Type: BIGINT
     * Remark: 订单id
     */
    private Long orderId;

    /**
     * Column: dish_id
     * Type: BIGINT
     * Remark: 菜品id
     */
    private Long dishId;

    /**
     * Column: setmeal_id
     * Type: BIGINT
     * Remark: 套餐id
     */
    private Long setmealId;

    /**
     * Column: dish_flavor
     * Type: VARCHAR(50)
     * Remark: 口味
     */
    private String dishFlavor;

    /**
     * Column: number
     * Type: INT
     * Default value: 1
     * Remark: 数量
     */
    private Integer number;

    /**
     * Column: amount
     * Type: DECIMAL
     * Remark: 金额
     */
    private BigDecimal amount;
}