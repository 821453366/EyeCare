package com.eu.front.entity;
public class EyeUser {
    private Integer userId;
    private String username;
    private String password;
    private String sex;
    private Integer age;
    private java.util.Date birthday;
    private String phone;
    private String email;
    private String address;
    private String description;
    public EyeUser() {
        super();
    }
    public EyeUser(Integer userId,String username,String password,String sex,Integer age,java.util.Date birthday,String phone,String email,String address,String description) {
        super();
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.description = description;
    }
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public java.util.Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
