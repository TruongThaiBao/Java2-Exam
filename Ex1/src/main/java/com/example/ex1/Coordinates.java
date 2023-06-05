package com.example.ex1;

public class Coordinates {
    private int x;
    private int y;
    private String name;

    public Coordinates(){
        //Constructor mặc định
    }
    public Coordinates(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (" + x + "," + y + ")";
    }
}
