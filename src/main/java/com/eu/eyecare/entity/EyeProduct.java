package com.eu.eyecare.entity;
public class EyeProduct {
    private Integer proId;
    private Double proOprice;
    private Double proNprice;
    private Integer proAmount;
    private Integer categoryId;
    private String proState;
    private String proType;
    private String proImg;
    public EyeProduct() {
        super();
    }
    public EyeProduct(Integer proId,Double proOprice,Double proNprice,Integer proAmount,Integer categoryId,String proState,String proType,String proImg) {
        super();
        this.proId = proId;
        this.proOprice = proOprice;
        this.proNprice = proNprice;
        this.proAmount = proAmount;
        this.categoryId = categoryId;
        this.proState = proState;
        this.proType = proType;
        this.proImg = proImg;
    }
    public Integer getProId() {
        return this.proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Double getProOprice() {
        return this.proOprice;
    }

    public void setProOprice(Double proOprice) {
        this.proOprice = proOprice;
    }

    public Double getProNprice() {
        return this.proNprice;
    }

    public void setProNprice(Double proNprice) {
        this.proNprice = proNprice;
    }

    public Integer getProAmount() {
        return this.proAmount;
    }

    public void setProAmount(Integer proAmount) {
        this.proAmount = proAmount;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProState() {
        return this.proState;
    }

    public void setProState(String proState) {
        this.proState = proState;
    }

    public String getProType() {
        return this.proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getProImg() {
        return this.proImg;
    }

    public void setProImg(String proImg) {
        this.proImg = proImg;
    }

}
