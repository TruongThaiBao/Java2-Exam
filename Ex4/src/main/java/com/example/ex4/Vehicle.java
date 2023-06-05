package com.example.ex4;

public class Vehicle {
    private String owner;
    private String type;
    private double price;
    private int capacity;

    public Vehicle() {
        //Constructor mặc định
    }

    public Vehicle(String owner, String type, double price, int capacity) {
        this.owner = owner;
        this.type = type;
        this.price = price;
        this.capacity = capacity;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Giá trị xe không hợp lệ");
        }
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        } else {
            throw new IllegalArgumentException("Dung tích xy-lanh không hợp lệ");
        }
    }

    public String getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public double calculateRegistrationFee(){
        if (capacity < 100) {
            return price * 0.01;
        } else if (capacity >= 100 && capacity <= 200) {
            return price * 0.03;
        } else {
            return price * 0.05;
        }
    }

}
