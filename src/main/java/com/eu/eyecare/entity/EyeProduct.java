package com.eu.eyecare.entity;
public class EyeProduct {
    private Integer proId;
    private String proName;
    private Double proOprice;
    private Double proNprice;
    private Integer proAmount;
    private Integer categoryId;
    private String proState;
    private String proType;
    private String file;
    private String proImg;

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Double getProOprice() {
        return proOprice;
    }

    public void setProOprice(Double proOprice) {
        this.proOprice = proOprice;
    }

    public Double getProNprice() {
        return proNprice;
    }

    public void setProNprice(Double proNprice) {
        this.proNprice = proNprice;
    }

    public Integer getProAmount() {
        return proAmount;
    }

    public void setProAmount(Integer proAmount) {
        this.proAmount = proAmount;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProState() {
        return proState;
    }

    public void setProState(String proState) {
        this.proState = proState;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getProImg() {
        return proImg;
    }

    public void setProImg(String proImg) {
        this.proImg = proImg;
    }
}
