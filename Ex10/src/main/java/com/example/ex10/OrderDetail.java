package com.example.ex10;

public class OrderDetail {
    private int quatity;
    private Product product;

    public OrderDetail(int quatity, Product product) {
        this.quatity = quatity;
        this.product = product;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public int getQuatity() {
        return quatity;
    }

    //Tính tiền sản phẩm
    public double calcTotalPrice() {
        return quatity * product.getPrice();
    }
}
