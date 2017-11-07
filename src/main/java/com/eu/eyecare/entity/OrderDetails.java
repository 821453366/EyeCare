package com.eu.eyecare.entity;
public class OrderDetails {
    private Integer odetailsId;
    private Integer orderId;
    private Integer proId;
    private Integer odetailsAmount;
    public OrderDetails() {
        super();
    }
    public OrderDetails(Integer odetailsId,Integer orderId,Integer proId,Integer odetailsAmount) {
        super();
        this.odetailsId = odetailsId;
        this.orderId = orderId;
        this.proId = proId;
        this.odetailsAmount = odetailsAmount;
    }
    public Integer getOdetailsId() {
        return this.odetailsId;
    }

    public void setOdetailsId(Integer odetailsId) {
        this.odetailsId = odetailsId;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProId() {
        return this.proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getOdetailsAmount() {
        return this.odetailsAmount;
    }

    public void setOdetailsAmount(Integer odetailsAmount) {
        this.odetailsAmount = odetailsAmount;
    }

}
