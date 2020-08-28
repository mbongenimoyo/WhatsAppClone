package com.example.WhatsAppClone.User;

public class UserObject {
    private String name,phone, uid;

    public UserObject(String uid,String name, String phone){
        this.name=name;
        this.phone=phone;
        this.uid=uid;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getUid(){return uid; }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUid(String uid){
        this.uid=uid;
    }
}
