package com.qfedu.domain;

public class McUser {
    private Integer uId;

    private String uName;

    private String uPassword;

    private String uPhone;

    private String uGender;

    private String uTouxiang;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuGender() {
        return uGender;
    }

    public void setuGender(String uGender) {
        this.uGender = uGender == null ? null : uGender.trim();
    }

    public String getuTouxiang() {
        return uTouxiang;
    }

    public void setuTouxiang(String uTouxiang) {
        this.uTouxiang = uTouxiang == null ? null : uTouxiang.trim();
    }
}