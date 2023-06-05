package com.example.ex7;

public class ToaDo {
    private String ten;
    private float x;
    private float y;

    @Override
    public String toString() {
        return ten + " (" + (int)x + "," + (int)y + ")";
    }
    public ToaDo(){
        //Constructor mặc định
    }

    public ToaDo(String ten, float x, float y) {
        this.ten = ten;
        this.x = x;
        this.y = y;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getTen() {
        return ten;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
