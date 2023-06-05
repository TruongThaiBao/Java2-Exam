package com.example.ex2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication{
    public static void main(String[] args) {
        SinhVien student1 = new SinhVien();
        student1.setMaSV(12345);
        student1.setHoTen("Van A");
        student1.setDiemLT(8.5F);
        student1.setDiemTH(9.0F);

        SinhVien student2 = new SinhVien(54321, "Thi B", 7.5F, 8.0F);

        System.out.println("Thông tin sinh viên 1:");
        System.out.println(student1.toString());

        System.out.println("Thông tin sinh viên 2:");
        System.out.println(student2.toString());
    }
}