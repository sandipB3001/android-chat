package com.group.chatting_app.model;

public class User {
    private String phNO;
    private String name;
    private String status;
    private String imageUrl;

    public User() {
    }

    public User(String phNO, String name, String status, String imageUrl) {
        this.phNO = phNO;
        this.name = name;
        this.status = status;
        this.imageUrl = imageUrl;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getPhNO() {
        return phNO;
    }

    public void setPhNO(String phNO) {
        this.phNO = phNO;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
