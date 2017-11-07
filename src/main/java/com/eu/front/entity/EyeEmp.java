package com.eu.front.entity;
public class EyeEmp {
    private Integer empId;
    private String empName;
    private String empPhone;
    private String empState;
    private String empImg;
    private String empSex;
    private java.util.Date empTime;
    private String empDesc;
    public EyeEmp() {
        super();
    }
    public EyeEmp(Integer empId,String empName,String empPhone,String empState,String empImg,String empSex,java.util.Date empTime,String empDesc) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empPhone = empPhone;
        this.empState = empState;
        this.empImg = empImg;
        this.empSex = empSex;
        this.empTime = empTime;
        this.empDesc = empDesc;
    }
    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhone() {
        return this.empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpState() {
        return this.empState;
    }

    public void setEmpState(String empState) {
        this.empState = empState;
    }

    public String getEmpImg() {
        return this.empImg;
    }

    public void setEmpImg(String empImg) {
        this.empImg = empImg;
    }

    public String getEmpSex() {
        return this.empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public java.util.Date getEmpTime() {
        return this.empTime;
    }

    public void setEmpTime(java.util.Date empTime) {
        this.empTime = empTime;
    }

    public String getEmpDesc() {
        return this.empDesc;
    }

    public void setEmpDesc(String empDesc) {
        this.empDesc = empDesc;
    }

}
