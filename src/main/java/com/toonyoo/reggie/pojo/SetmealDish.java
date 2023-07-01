package com.toonyoo.reggie.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * Table: setmeal_dish
 */
@Data
public class SetmealDish {
    /**
     * Column: id
     * Type: BIGINT
     * Remark: 主键
     */
    private Long id;

    /**
     * Column: setmeal_id
     * Type: VARCHAR(32)
     * Remark: 套餐id 
     */
    private String setmealId;

    /**
     * Column: dish_id
     * Type: VARCHAR(32)
     * Remark: 菜品id
     */
    private String dishId;

    /**
     * Column: name
     * Type: VARCHAR(32)
     * Remark: 菜品名称 （冗余字段）
     */
    private String name;

    /**
     * Column: price
     * Type: DECIMAL
     * Remark: 菜品原价（冗余字段）
     */
    private BigDecimal price;

    /**
     * Column: copies
     * Type: INT
     * Remark: 份数
     */
    private Integer copies;

    /**
     * Column: sort
     * Type: INT
     * Default value: 0
     * Remark: 排序
     */
    private Integer sort;

    /**
     * Column: create_time
     * Type: DATETIME
     * Remark: 创建时间
     */
    private Date createTime;

    /**
     * Column: update_time
     * Type: DATETIME
     * Remark: 更新时间
     */
    private Date updateTime;

    /**
     * Column: create_user
     * Type: BIGINT
     * Remark: 创建人
     */
    private Long createUser;

    /**
     * Column: update_user
     * Type: BIGINT
     * Remark: 修改人
     */
    private Long updateUser;

    /**
     * Column: is_deleted
     * Type: INT
     * Default value: 0
     * Remark: 是否删除
     */
    private Integer isDeleted;
}