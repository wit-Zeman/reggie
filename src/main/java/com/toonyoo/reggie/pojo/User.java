package com.toonyoo.reggie.pojo;

import lombok.Data;

/**
 * Table: user
 */
@Data
public class User {
    /**
     * Column: id
     * Type: BIGINT
     * Remark: 主键
     */
    private Long id;

    /**
     * Column: name
     * Type: VARCHAR(50)
     * Remark: 姓名
     */
    private String name;

    /**
     * Column: phone
     * Type: VARCHAR(100)
     * Remark: 手机号
     */
    private String phone;

    /**
     * Column: sex
     * Type: VARCHAR(2)
     * Remark: 性别
     */
    private String sex;

    /**
     * Column: id_number
     * Type: VARCHAR(18)
     * Remark: 身份证号
     */
    private String idNumber;

    /**
     * Column: avatar
     * Type: VARCHAR(500)
     * Remark: 头像
     */
    private String avatar;

    /**
     * Column: status
     * Type: INT
     * Default value: 0
     * Remark: 状态 0:禁用，1:正常
     */
    private Integer status;
}