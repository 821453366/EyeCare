package com.eu.eyecare.entity;
public class ProCategory {
    private Integer catId;
    private String catName;
    private String catBrand;
    private String catDate;

    public String getCatDate() {
        return catDate;
    }

    public void setCatDate(String catDate) {
        this.catDate = catDate;
    }

    public ProCategory() {
        super();
    }

    public Integer getCatId() {
        return this.catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return this.catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatBrand() {
        return this.catBrand;
    }

    public void setCatBrand(String catBrand) {
        this.catBrand = catBrand;
    }

}
