package com.bridgelabz;

public class Contact {
    String name;
    String age;
    String phoneNumber;
    String city;
    String state;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "{Name=" + name + ", Age=" + age + ", Phone Number=" + phoneNumber + ", City=" + city + ", State="
                + state + "}\n";
    }
}
