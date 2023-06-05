package com.example.ex7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {
    public static void main(String[] args) {
        ToaDo tam = new ToaDo("O", 5, 5);
        double banKinh = 10.5;

        HinhTron hinhTron = new HinhTron(tam, banKinh);

        System.out.println("Hình tròn có tâm " + hinhTron.getTam().toString() +
                " với bán kính là " + hinhTron.getBanKinh());
        System.out.println("Chu vi của hình tròn: " + hinhTron.tinhChuVi());
        System.out.println("Diện tích của hình tròn: " + hinhTron.tinhDienTich());
    }
}