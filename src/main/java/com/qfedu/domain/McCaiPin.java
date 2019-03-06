package com.qfedu.domain;

public class McCaiPin {
    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    private Integer kId;

    private String kName;

    private Integer kPrice;

    private String kComm;

    private String kCaipin;

    private String kPicture;

    private String kState;

    private Long totalPrice;


    public String getkState() {
        return kState;
    }

    public void setkState(String kState) {
        this.kState = kState;
    }

    public Integer getkId() {
        return kId;
    }

    public void setkId(Integer kId) {
        this.kId = kId;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName == null ? null : kName.trim();
    }

    public Integer getkPrice() {
        return kPrice;
    }

    public void setkPrice(Integer kPrice) {
        this.kPrice = kPrice;
    }

    public String getkComm() {
        return kComm;
    }

    public void setkComm(String kComm) {
        this.kComm = kComm == null ? null : kComm.trim();
    }

    public String getkCaipin() {
        return kCaipin;
    }

    public void setkCaipin(String kCaipin) {
        this.kCaipin = kCaipin == null ? null : kCaipin.trim();
    }

    public String getkPicture() {
        return kPicture;
    }

    public void setkPicture(String kPicture) {
        this.kPicture = kPicture == null ? null : kPicture.trim();
    }
}