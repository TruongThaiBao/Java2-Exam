package com.example.ex6;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035;

    public Account(){
        //Constructor mặc định
        this.accNumber = 999999;
        this.name = "Chưa xác định";
        this.balance = 50000;
    }
    public Account(long accNumber, String name, double balance) {
        if (accNumber <= 0) {
            throw new IllegalArgumentException("Dữ liệu không hợp lệ!");
        }
        this.accNumber = accNumber;
        this.name = name.isEmpty() ? "Chưa xác định" : name;
        this.balance = balance < 50000 ? 50000 : balance;
    }
    public Account(long accNumber, String name){
        if (accNumber <= 0) {
            throw new IllegalArgumentException("Dữ liệu không hợp lệ!");
        }
        this.accNumber = accNumber;
        this.name = name.isEmpty() ? "Chưa xác định" : name;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    //Gửi tiền
    public boolean deposit(double amount){
        if (amount > 0){
            balance = balance + amount;
            return true;
        }
        return false;
    }
    //Rút tiền
    public boolean withDraw(double amount, double fee){
        if (amount > 0 && (amount + fee) <= balance){
            balance = balance - amount - fee;
            return true;
        }
        return false;
    }
    //Tính lãi
    public void addInterest(){
        balance = balance + balance * RATE;
    }
    //Chuyển tiền
    public boolean transfer(Account accNhan, double amount){
        this.balance = balance - amount;
        accNhan.deposit(amount);
        return true;
    }
    @Override
    public String toString(){
        Locale locale = new Locale("vi","vn");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return format.format(balance);
    }
}
