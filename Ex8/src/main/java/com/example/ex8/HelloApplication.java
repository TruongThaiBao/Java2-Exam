package com.example.ex8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication{
    public static void main(String[] args) {
        CDList cdList = new CDList(5); // Khởi tạo CDList với kích thước 5

        // Thêm các CD vào danh sách
        cdList.addCD(new CD(-1, "CD 3", 10, 10.5f));
        cdList.addCD(new CD(2, "CD 5", 8, 20.0f));
        cdList.addCD(new CD(3, "CD 1", 12, 18.2f));
        cdList.addCD(new CD(4, "CD 4", 9, 11.8f));
        cdList.addCD(new CD(5, "CD 2", 15, 21.6f));

        // Số lượng CD trong danh sách
        System.out.println("Số lượng CD trong danh sách: " + cdList.countCDs());

        // Tổng giá thành của các CD
        System.out.println("Tổng giá thành của các CD: " + cdList.calculateTotalCost());

        // Thông tin của toàn bộ CD trong danh sách
        System.out.println("Thông tin của toàn bộ CD trong danh sách:");
        cdList.show();

        // Sắp xếp danh sách giảm dần theo giá thành
//        cdList.giamDanTheoGia();

        // Sắp xếp danh sách tăng dần theo tựa CD
        cdList.tangDanTheoTua();

        // Thông tin của toàn bộ CD sau khi sắp xếp
        System.out.println("Thông tin của toàn bộ CD sau khi sắp xếp:");
        cdList.show();
    }
}