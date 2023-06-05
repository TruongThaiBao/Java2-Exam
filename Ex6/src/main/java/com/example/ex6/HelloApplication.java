package com.example.ex6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication{
    public static void main(String[] args) {
        Account acc1 = new Account(72354,"Ted Murphy",102.56);
        Account acc2 = new Account(69713,"Jane Smith",40.00);
        Account acc3 = new Account(93757,"Edward Demsay",759.32);
//        System.out.println("Account 1: " + acc1.getAccNumber());
//        System.out.println(acc1);
//        System.out.println("\nAccount 2: "+ acc2.getAccNumber());
//        System.out.println(acc2);
//        System.out.println("\nAccount 3: "+ acc3.getAccNumber());
//        System.out.println(acc3);
        acc1.deposit(25.85);
        acc2.deposit(500.00);
        System.out.println("Account 1: " + acc1.getAccNumber());
        System.out.println(acc1);
        System.out.println("\nAccount 2: "+ acc2.getAccNumber());
        System.out.println(acc2);
        System.out.println("\nAccount 3: "+ acc3.getAccNumber());
        System.out.println(acc3);

        System.out.println("Trước khi chuyển:");
        System.out.println("Số dư acc1: " + acc1.getBalance());
        System.out.println("Số dư acc2: " + acc2.getBalance());

        // Chuyển 100 từ acc2 sang acc1
        acc2.transfer(acc1, 100.0);

        System.out.println("Sau khi chuyển:");
        System.out.println("Số dư acc1: " + acc1.getBalance());
        System.out.println("Số dư acc2: " + acc2.getBalance());
    }
}