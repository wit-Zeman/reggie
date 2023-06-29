package com.toonyoo.reggie.pojo;

/**
 * Table: user
 */
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}