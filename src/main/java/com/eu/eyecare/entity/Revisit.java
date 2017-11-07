package com.eu.eyecare.entity;
public class Revisit {
    private Integer reId;
    private Integer empId;
    private Integer orderId;
    private Integer reCount;
    private String reInfo;
    private java.util.Date reTime;
    private String orderDesc;
    public Revisit() {
        super();
    }
    public Revisit(Integer reId,Integer empId,Integer orderId,Integer reCount,String reInfo,java.util.Date reTime,String orderDesc) {
        super();
        this.reId = reId;
        this.empId = empId;
        this.orderId = orderId;
        this.reCount = reCount;
        this.reInfo = reInfo;
        this.reTime = reTime;
        this.orderDesc = orderDesc;
    }
    public Integer getReId() {
        return this.reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getReCount() {
        return this.reCount;
    }

    public void setReCount(Integer reCount) {
        this.reCount = reCount;
    }

    public String getReInfo() {
        return this.reInfo;
    }

    public void setReInfo(String reInfo) {
        this.reInfo = reInfo;
    }

    public java.util.Date getReTime() {
        return this.reTime;
    }

    public void setReTime(java.util.Date reTime) {
        this.reTime = reTime;
    }

    public String getOrderDesc() {
        return this.orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

}
