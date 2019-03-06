package com.qfedu.domain;

public class McPingJia {
    private Integer pId;

    private Integer pUId;

    private Integer pKId;

    private String pComment;

    private String pResponce;

    private String pCreatetime;

    private String pState;

    private String pXingxing;

    public String getpXingxing() {
        return pXingxing;
    }

    public void setpXingxing(String pXingxing) {
        this.pXingxing = pXingxing;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getpUId() {
        return pUId;
    }

    public void setpUId(Integer pUId) {
        this.pUId = pUId;
    }

    public Integer getpKId() {
        return pKId;
    }

    public void setpKId(Integer pKId) {
        this.pKId = pKId;
    }

    public String getpComment() {
        return pComment;
    }

    public void setpComment(String pComment) {
        this.pComment = pComment == null ? null : pComment.trim();
    }

    public String getpResponce() {
        return pResponce;
    }

    public void setpResponce(String pResponce) {
        this.pResponce = pResponce == null ? null : pResponce.trim();
    }

    public String getpCreatetime() {
        return pCreatetime;
    }

    public void setpCreatetime(String pCreatetime) {
        this.pCreatetime = pCreatetime == null ? null : pCreatetime.trim();
    }

    public String getpState() {
        return pState;
    }

    public void setpState(String pState) {
        this.pState = pState == null ? null : pState.trim();
    }
}