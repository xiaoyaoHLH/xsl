package com.xsl.pojo;

public class Task {
    private Integer id;

    private Short sid;

    private Short hid;

    private String title;

    private String content;

    private String image;

    private Short money;

    private String sendTime;

    private String receiveTime;

    private String achieveTime;

    private String timeLimit;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getSid() {
        return sid;
    }

    public void setSid(Short sid) {
        this.sid = sid;
    }

    public Short getHid() {
        return hid;
    }

    public void setHid(Short hid) {
        this.hid = hid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Short getMoney() {
        return money;
    }

    public void setMoney(Short money) {
        this.money = money;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime == null ? null : sendTime.trim();
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime == null ? null : receiveTime.trim();
    }

    public String getAchieveTime() {
        return achieveTime;
    }

    public void setAchieveTime(String achieveTime) {
        this.achieveTime = achieveTime == null ? null : achieveTime.trim();
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit == null ? null : timeLimit.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}