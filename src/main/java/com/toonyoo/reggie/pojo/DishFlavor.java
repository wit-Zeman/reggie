package com.toonyoo.reggie.pojo;

import java.util.Date;
import lombok.Data;

/**
 * Table: dish_flavor
 */
@Data
public class DishFlavor {
    /**
     * Column: id
     * Type: BIGINT
     * Remark: 主键
     */
    private Long id;

    /**
     * Column: dish_id
     * Type: BIGINT
     * Remark: 菜品
     */
    private Long dishId;

    /**
     * Column: name
     * Type: VARCHAR(64)
     * Remark: 口味名称
     */
    private String name;

    /**
     * Column: value
     * Type: VARCHAR(500)
     * Remark: 口味数据list
     */
    private String value;

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