package com.example.ex4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo 3 đối tượng xe
        Vehicle xe1 = new Vehicle("Nguyen Van A","XXX", 5000, 80);
        Vehicle xe2 = new Vehicle("Nguyen Thi B", "YYY", 10000, 110);

        // Nhập thông tin xe3 từ người dùng
        System.out.print("Nhập chủ xe xe3: ");
        String owner = scanner.nextLine();
        System.out.print("Nhập loại xe xe3: ");
        String type = scanner.nextLine();
        System.out.print("Nhập giá trị xe xe3: ");
        double price = scanner.nextDouble();
        System.out.print("Nhập dung tích xi-lanh xe xe3: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line

        Vehicle xe3 = new Vehicle(owner, type, price, capacity);

        // In thông tin và mức thuế đăng ký của từng xe
        System.out.println("Thông tin xe1:");
        System.out.println("Chủ xe: " + xe1.getOwner());
        System.out.println("Loại xe: " + xe1.getType());
        System.out.println("Giá trị xe: " + xe1.getPrice());
        System.out.println("Mức thuế đăng ký: " + xe1.calculateRegistrationFee());

        System.out.println("Thông tin xe2:");
        System.out.println("Chủ xe: " + xe2.getOwner());
        System.out.println("Loại xe: " + xe2.getType());
        System.out.println("Giá trị xe: " + xe2.getPrice());
        System.out.println("Mức thuế đăng ký: " + xe2.calculateRegistrationFee());

        System.out.println("Thông tin xe3:");
        System.out.println("Chủ xe: " + xe3.getOwner());
        System.out.println("Loại xe: " + xe3.getType());
        System.out.println("Giá trị xe: " + xe3.getPrice());
        System.out.println("Mức thuế đăng ký: " + xe3.calculateRegistrationFee());
    }
}