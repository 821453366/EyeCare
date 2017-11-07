package com.eu.front.entity;
public class OrderInfo {
    private Integer orderId;
    private Integer userId;
    private java.util.Date createTime;
    private java.util.Date finishTime;
    private String orderState;
    private Double orderTotalprice;
    private Double orderNprice;
    private String payWay;
    private Double factPay;
    private java.util.Date paytime;
    public OrderInfo() {
        super();
    }
    public OrderInfo(Integer orderId,Integer userId,java.util.Date createTime,java.util.Date finishTime,String orderState,Double orderTotalprice,Double orderNprice,String payWay,Double factPay,java.util.Date paytime) {
        super();
        this.orderId = orderId;
        this.userId = userId;
        this.createTime = createTime;
        this.finishTime = finishTime;
        this.orderState = orderState;
        this.orderTotalprice = orderTotalprice;
        this.orderNprice = orderNprice;
        this.payWay = payWay;
        this.factPay = factPay;
        this.paytime = paytime;
    }
    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getFinishTime() {
        return this.finishTime;
    }

    public void setFinishTime(java.util.Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getOrderState() {
        return this.orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Double getOrderTotalprice() {
        return this.orderTotalprice;
    }

    public void setOrderTotalprice(Double orderTotalprice) {
        this.orderTotalprice = orderTotalprice;
    }

    public Double getOrderNprice() {
        return this.orderNprice;
    }

    public void setOrderNprice(Double orderNprice) {
        this.orderNprice = orderNprice;
    }

    public String getPayWay() {
        return this.payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public Double getFactPay() {
        return this.factPay;
    }

    public void setFactPay(Double factPay) {
        this.factPay = factPay;
    }

    public java.util.Date getPaytime() {
        return this.paytime;
    }

    public void setPaytime(java.util.Date paytime) {
        this.paytime = paytime;
    }

}
