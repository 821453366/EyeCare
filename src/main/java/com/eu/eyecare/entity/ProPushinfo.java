package com.eu.eyecare.entity;
public class ProPushinfo {
    private Integer pushId;
    private String pushName;
    private Double pushOprice;
    private Double pushNprice;
    private String pushDesc;
    private String pushImg;
    private String pushState;
    public ProPushinfo() {
        super();
    }
    public ProPushinfo(Integer pushId,String pushName,Double pushOprice,Double pushNprice,String pushDesc,String pushImg,String pushState) {
        super();
        this.pushId = pushId;
        this.pushName = pushName;
        this.pushOprice = pushOprice;
        this.pushNprice = pushNprice;
        this.pushDesc = pushDesc;
        this.pushImg = pushImg;
        this.pushState = pushState;
    }
    public Integer getPushId() {
        return this.pushId;
    }

    public void setPushId(Integer pushId) {
        this.pushId = pushId;
    }

    public String getPushName() {
        return this.pushName;
    }

    public void setPushName(String pushName) {
        this.pushName = pushName;
    }

    public Double getPushOprice() {
        return this.pushOprice;
    }

    public void setPushOprice(Double pushOprice) {
        this.pushOprice = pushOprice;
    }

    public Double getPushNprice() {
        return this.pushNprice;
    }

    public void setPushNprice(Double pushNprice) {
        this.pushNprice = pushNprice;
    }

    public String getPushDesc() {
        return this.pushDesc;
    }

    public void setPushDesc(String pushDesc) {
        this.pushDesc = pushDesc;
    }

    public String getPushImg() {
        return this.pushImg;
    }

    public void setPushImg(String pushImg) {
        this.pushImg = pushImg;
    }

    public String getPushState() {
        return this.pushState;
    }

    public void setPushState(String pushState) {
        this.pushState = pushState;
    }

}
