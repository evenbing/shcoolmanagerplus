package com.cyz.bean;

public class Course {
    private Integer cid;

    private String cname;

    private String cmsg;

    private Integer cgrade;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCmsg() {
        return cmsg;
    }

    public void setCmsg(String cmsg) {
        this.cmsg = cmsg == null ? null : cmsg.trim();
    }

    public Integer getCgrade() {
        return cgrade;
    }

    public void setCgrade(Integer cgrade) {
        this.cgrade = cgrade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cmsg='" + cmsg + '\'' +
                ", cgrade=" + cgrade +
                '}';
    }
}