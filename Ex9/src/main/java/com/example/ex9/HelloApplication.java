package com.example.ex9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication{
    public static void main(String[] args) {
        int size = 10;
        DanhSachCongNhan dsCongNhan = new DanhSachCongNhan(size);

        CongNhan congNhan1 = new CongNhan(1, "Nguyen", "Van 1", 200);
        dsCongNhan.themCongNhan(congNhan1);

        CongNhan congNhan2 = new CongNhan(2, "Tran", "Thi 2", 300);
        dsCongNhan.themCongNhan(congNhan2);

        CongNhan congNhan3 = new CongNhan(3, "Vo", "Van 3", 400);
        dsCongNhan.themCongNhan(congNhan3);


        System.out.printf("Số lượng công nhân: %d\n",dsCongNhan.tinhSLCongNhan());
        System.out.println("Danh sách toàn bộ nhân viên: ");
        dsCongNhan.xuatThongTinCongNhan();

        // Sắp xếp công nhân theo số sản phẩm giảm dần
        dsCongNhan.sapXepCongNhanTheoSPGiamDan();

        // Xuất thông tin các công nhân sau khi sắp xếp
        dsCongNhan.xuatThongTinCongNhan();
    }
}