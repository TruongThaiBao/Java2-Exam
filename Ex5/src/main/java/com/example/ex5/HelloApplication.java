package com.example.ex5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Date;

public class HelloApplication {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date pastDate = new Date(currentDate.getTime() - 86400000); // 1 day ago
        Date nextDate = new Date(currentDate.getTime() + 86400000); // 1 day ago

        HangThucPham hang1 = new HangThucPham("H001");
        HangThucPham hang2 = new HangThucPham("H002", "YYY", 10000, currentDate, currentDate);
        HangThucPham hang3 = new HangThucPham("H003", "ZZZ", 20000, pastDate, nextDate);

        System.out.println(hang1);
        System.out.println(hang2);
        System.out.println(hang3);
    }
}