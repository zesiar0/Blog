package com.springboot.blog.entity;

import java.util.Date;

public class friendLink {

    private Long id;
    private String blogName;
    private String blogAddress;
    private String pictureAddress;
    private Date createTime;

    public friendLink() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogAddress() {
        return blogAddress;
    }

    public void setBlogAddress(String blogAddress) {
        this.blogAddress = blogAddress;
    }

    public String getPictureAddress() {
        return pictureAddress;
    }

    public void setPictureAddress(String pictureAddress) {
        this.pictureAddress = pictureAddress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "friendLink{" +
                "id=" + id +
                ", blogName='" + blogName + '\'' +
                ", blogAddress='" + blogAddress + '\'' +
                ", pictureAddress='" + pictureAddress + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
