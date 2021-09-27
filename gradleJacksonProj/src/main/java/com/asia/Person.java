package com.asia;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;

import java.util.List;

public class Person {
    public Person (){};
    String pFname;
    String pLname;
    String pId;
    int age;
    float salary;
    String color;
    boolean isEmployed;
    List subject;

    Address address;

    public String getpFname() {
        return pFname;
    }

    public void setpFname(String pFname) {
        this.pFname = pFname;
    }

    public String getpLname() {
        return pLname;
    }

    public void setpLname(String pLname) {
        this.pLname = pLname;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public List getSubject() {
        return subject;
    }

    public void setSubject(List subject) {
        this.subject = subject;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Person(String pFname, String pLname, String pId, int age, float salary, String color, boolean isEmployed, List subject, Address address) {
        this.pFname = pFname;
        this.pLname = pLname;
        this.pId = pId;
        this.age = age;
        this.salary = salary;
        this.color = color;
        this.isEmployed = isEmployed;
        this.subject = subject;
        this.address = address;
    }
}
