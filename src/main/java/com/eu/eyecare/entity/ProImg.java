package com.eu.eyecare.entity;
public class ProImg {
    private Integer imgId;
    private String imgUrl;
    private Integer proId;
    public ProImg() {
        super();
    }
    public ProImg(Integer imgId,String imgUrl,Integer proId) {
        super();
        this.imgId = imgId;
        this.imgUrl = imgUrl;
        this.proId = proId;
    }
    public Integer getImgId() {
        return this.imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getProId() {
        return this.proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

}
