package com.houserent.domain;


import java.util.PropertyResourceBundle;

public class House {
    private int id;
    private String NAME;
    private String phone;
    private String address;
    private int rent;
    private String state;

    public House(int id, String NAME, String phone, String address, int rent, String state) {
        this.id = id;
        this.NAME = NAME;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //方便输出对象信息

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", NAME='" + NAME + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", rent=" + rent +
                ", state='" + state + '\'' +
                '}';
    }

}
