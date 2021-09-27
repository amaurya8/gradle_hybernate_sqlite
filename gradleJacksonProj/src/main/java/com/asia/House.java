package com.asia;

public class House {
    int noOfRooms;
    int floor;
    public House(){};
    public House(int noOfRooms, int floor, String houseType) {
        this.noOfRooms = noOfRooms;
        this.floor = floor;
        this.houseType = houseType;
    }
    String houseType;

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

}
