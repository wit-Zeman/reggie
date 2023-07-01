package com.toonyoo.reggie.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * Table: dish
 */
@Data
public class Dish {
    /**
     * Column: id
     * Type: BIGINT
     * Remark: 主键
     */
    private Long id;

    /**
     * Column: name
     * Type: VARCHAR(64)
     * Remark: 菜品名称
     */
    private String name;

    /**
     * Column: category_id
     * Type: BIGINT
     * Remark: 菜品分类id
     */
    private Long categoryId;

    /**
     * Column: price
     * Type: DECIMAL
     * Remark: 菜品价格
     */
    private BigDecimal price;

    /**
     * Column: code
     * Type: VARCHAR(64)
     * Remark: 商品码
     */
    private String code;

    /**
     * Column: image
     * Type: VARCHAR(200)
     * Remark: 图片
     */
    private String image;

    /**
     * Column: description
     * Type: VARCHAR(400)
     * Remark: 描述信息
     */
    private String description;

    /**
     * Column: status
     * Type: INT
     * Default value: 1
     * Remark: 0 停售 1 起售
     */
    private Integer status;

    /**
     * Column: sort
     * Type: INT
     * Default value: 0
     * Remark: 顺序
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