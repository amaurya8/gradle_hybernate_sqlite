package com.asia;

public class Address {
    String flatNo;
    int pinCode;
    String Society;
    String nearBy;
    House house;
    public Address(){};
    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getSociety() {
        return Society;
    }

    public void setSociety(String society) {
        Society = society;
    }

    public String getNearBy() {
        return nearBy;
    }

    public void setNearBy(String nearBy) {
        this.nearBy = nearBy;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Address(String flatNo, int pinCode, String society, String nearBy, House house) {
        this.flatNo = flatNo;
        this.pinCode = pinCode;
        Society = society;
        this.nearBy = nearBy;
        this.house = house;
    }
}
