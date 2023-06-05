package com.example.ex10;

public class Product {
    private String description;
    private String productID;
    private double price;

    public Product(){
        //Constructor mặc định
    }
    public Product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sản phẩm{" +
                "Mô tả='" + description + '\'' +
                ", Mã SP='" + productID + '\'' +
                ", Giá=" + price +
                '}';
    }
}
