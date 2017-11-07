package com.eu.eyecare.entity;
public class ProCategory {
    private Integer catId;
    private String catName;
    private String catBrand;
    private String catEffect;
    public ProCategory() {
        super();
    }
    public ProCategory(Integer catId,String catName,String catBrand,String catEffect) {
        super();
        this.catId = catId;
        this.catName = catName;
        this.catBrand = catBrand;
        this.catEffect = catEffect;
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

    public String getCatEffect() {
        return this.catEffect;
    }

    public void setCatEffect(String catEffect) {
        this.catEffect = catEffect;
    }

}
