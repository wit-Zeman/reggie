package com.toonyoo.reggie.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * Table: orders
 */
@Data
public class Orders {
    /**
     * Column: id
     * Type: BIGINT
     * Remark: 主键
     */
    private Long id;

    /**
     * Column: number
     * Type: VARCHAR(50)
     * Remark: 订单号
     */
    private String number;

    /**
     * Column: status
     * Type: INT
     * Default value: 1
     * Remark: 订单状态 1待付款，2待派送，3已派送，4已完成，5已取消
     */
    private Integer status;

    /**
     * Column: user_id
     * Type: BIGINT
     * Remark: 下单用户
     */
    private Long userId;

    /**
     * Column: address_book_id
     * Type: BIGINT
     * Remark: 地址id
     */
    private Long addressBookId;

    /**
     * Column: order_time
     * Type: DATETIME
     * Remark: 下单时间
     */
    private Date orderTime;

    /**
     * Column: checkout_time
     * Type: DATETIME
     * Remark: 结账时间
     */
    private Date checkoutTime;

    /**
     * Column: pay_method
     * Type: INT
     * Default value: 1
     * Remark: 支付方式 1微信,2支付宝
     */
    private Integer payMethod;

    /**
     * Column: amount
     * Type: DECIMAL
     * Remark: 实收金额
     */
    private BigDecimal amount;

    /**
     * Column: remark
     * Type: VARCHAR(100)
     * Remark: 备注
     */
    private String remark;

    /**
     * Column: phone
     * Type: VARCHAR(255)
     */
    private String phone;

    /**
     * Column: address
     * Type: VARCHAR(255)
     */
    private String address;

    /**
     * Column: user_name
     * Type: VARCHAR(255)
     */
    private String userName;

    /**
     * Column: consignee
     * Type: VARCHAR(255)
     */
    private String consignee;
}