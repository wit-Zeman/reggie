package com.toonyoo.reggie.pojo;

import java.util.Date;
import lombok.Data;

/**
 * Table: category
 */
@Data
public class Category {
    /**
     * Column: id
     * Type: BIGINT
     * Remark: 主键
     */
    private Long id;

    /**
     * Column: type
     * Type: INT
     * Remark: 类型   1 菜品分类 2 套餐分类
     */
    private Integer type;

    /**
     * Column: name
     * Type: VARCHAR(64)
     * Remark: 分类名称
     */
    private String name;

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
}