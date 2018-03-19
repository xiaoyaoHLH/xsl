package com.xsl.pojo;

public class Hunter {
    private Integer id;

    private Integer uid;

    private Integer empirical;

    private Short receiveCount;

    private String introduction;

    private String newTime;

    private Integer level;

    private Integer tag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getEmpirical() {
        return empirical;
    }

    public void setEmpirical(Integer empirical) {
        this.empirical = empirical;
    }

    public Short getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(Short receiveCount) {
        this.receiveCount = receiveCount;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getNewTime() {
        return newTime;
    }

    public void setNewTime(String newTime) {
        this.newTime = newTime == null ? null : newTime.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }
}