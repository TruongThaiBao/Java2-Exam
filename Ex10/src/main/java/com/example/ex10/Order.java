package com.example.ex10;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private List<OrderDetail> lineItems;
    private int count;

    public Order(int orderID, LocalDate orderDate, List<OrderDetail> lineItems, int count) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = lineItems;
        this.count = lineItems.size();
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<OrderDetail> getLineItems() {
        return lineItems;
    }
}
