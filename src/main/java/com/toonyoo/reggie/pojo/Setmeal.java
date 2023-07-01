package com.toonyoo.reggie.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * Table: setmeal
 */
@Data
public class Setmeal {
    /**
     * Column: id
     * Type: BIGINT
     * Remark: 主键
     */
    private Long id;

    /**
     * Column: category_id
     * Type: BIGINT
     * Remark: 菜品分类id
     */
    private Long categoryId;

    /**
     * Column: name
     * Type: VARCHAR(64)
     * Remark: 套餐名称
     */
    private String name;

    /**
     * Column: price
     * Type: DECIMAL
     * Remark: 套餐价格
     */
    private BigDecimal price;

    /**
     * Column: status
     * Type: INT
     * Remark: 状态 0:停用 1:启用
     */
    private Integer status;

    /**
     * Column: code
     * Type: VARCHAR(32)
     * Remark: 编码
     */
    private String code;

    /**
     * Column: description
     * Type: VARCHAR(512)
     * Remark: 描述信息
     */
    private String description;

    /**
     * Column: image
     * Type: VARCHAR(255)
     * Remark: 图片
     */
    private String image;

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