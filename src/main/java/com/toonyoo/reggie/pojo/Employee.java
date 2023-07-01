package com.toonyoo.reggie.pojo;

import java.util.Date;
import lombok.Data;

/**
 * Table: employee
 */
@Data
public class Employee {
    /**
     * Column: id
     * Type: BIGINT
     * Remark: 主键
     */
    private Long id;

    /**
     * Column: name
     * Type: VARCHAR(32)
     * Remark: 姓名
     */
    private String name;

    /**
     * Column: username
     * Type: VARCHAR(32)
     * Remark: 用户名
     */
    private String username;

    /**
     * Column: password
     * Type: VARCHAR(64)
     * Remark: 密码
     */
    private String password;

    /**
     * Column: phone
     * Type: VARCHAR(11)
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
     * Column: status
     * Type: INT
     * Default value: 1
     * Remark: 状态 0:禁用，1:正常
     */
    private Integer status;

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