package com.toonyoo.reggie.pojo;

import java.util.Date;
import lombok.Data;

/**
 * Table: address_book
 */
@Data
public class AddressBook {
    /**
     * Column: id
     * Type: BIGINT
     * Remark: 主键
     */
    private Long id;

    /**
     * Column: user_id
     * Type: BIGINT
     * Remark: 用户id
     */
    private Long userId;

    /**
     * Column: consignee
     * Type: VARCHAR(50)
     * Remark: 收货人
     */
    private String consignee;

    /**
     * Column: sex
     * Type: TINYINT(3)
     * Remark: 性别 0 女 1 男
     */
    private Byte sex;

    /**
     * Column: phone
     * Type: VARCHAR(11)
     * Remark: 手机号
     */
    private String phone;

    /**
     * Column: province_code
     * Type: VARCHAR(12)
     * Remark: 省级区划编号
     */
    private String provinceCode;

    /**
     * Column: province_name
     * Type: VARCHAR(32)
     * Remark: 省级名称
     */
    private String provinceName;

    /**
     * Column: city_code
     * Type: VARCHAR(12)
     * Remark: 市级区划编号
     */
    private String cityCode;

    /**
     * Column: city_name
     * Type: VARCHAR(32)
     * Remark: 市级名称
     */
    private String cityName;

    /**
     * Column: district_code
     * Type: VARCHAR(12)
     * Remark: 区级区划编号
     */
    private String districtCode;

    /**
     * Column: district_name
     * Type: VARCHAR(32)
     * Remark: 区级名称
     */
    private String districtName;

    /**
     * Column: detail
     * Type: VARCHAR(200)
     * Remark: 详细地址
     */
    private String detail;

    /**
     * Column: label
     * Type: VARCHAR(100)
     * Remark: 标签
     */
    private String label;

    /**
     * Column: is_default
     * Type: BIT
     * Default value: 0
     * Remark: 默认 0 否 1是
     */
    private Boolean isDefault;

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