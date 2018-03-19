package com.xsl.pojo;

public class UserNetwork {
    private Short mid;

    private Short hid;

    private String count;

    private String newTime;

    public Short getMid() {
        return mid;
    }

    public void setMid(Short mid) {
        this.mid = mid;
    }

    public Short getHid() {
        return hid;
    }

    public void setHid(Short hid) {
        this.hid = hid;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count == null ? null : count.trim();
    }

    public String getNewTime() {
        return newTime;
    }

    public void setNewTime(String newTime) {
        this.newTime = newTime == null ? null : newTime.trim();
    }
}