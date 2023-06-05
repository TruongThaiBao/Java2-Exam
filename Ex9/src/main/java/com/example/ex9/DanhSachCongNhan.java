package com.example.ex9;

public class DanhSachCongNhan {
    private CongNhan[] danhSach;
    private int soLuongCongNhan;
    private int size;

    //Khởi tạo dsach công nhân
    public DanhSachCongNhan(int size) {
        danhSach = new CongNhan[size];
        soLuongCongNhan = 0;
        this.size = size;
    }

    //Thêm công nhân
    public boolean themCongNhan(CongNhan congNhan) {
        if (soLuongCongNhan < size) {
            danhSach[soLuongCongNhan] = congNhan;
            soLuongCongNhan++;
            return true;
        } else {
            return false;
        }
    }

    //Tính số lượng nhân viên
    public int tinhSLCongNhan(){
        return soLuongCongNhan;
    }

    //Xuất toàn bộ thông tin công nhân
    public void xuatThongTinCongNhan() {
        for (int i = 0; i < soLuongCongNhan; i++) {
            System.out.println("Thông tin công nhân " + (i+1) + ":");
            System.out.println(danhSach[i].toString());
            System.out.println("-----------------------");
        }
    }

    //Xuất thông tin của công nhân >200 sp
    public void xuatThongTinCNTren200SP() {
        for (int i = 0; i < soLuongCongNhan; i++) {
            if (danhSach[i].getmSoSP() > 200) {
                System.out.println("Thông tin công nhân " + (i+1) + ":");
                System.out.println(danhSach[i].toString());
                System.out.println("-----------------------");
            }
        }
    }

    //Xuất thông tin CN giảm dần theo sản phẩm
    public void sapXepCongNhanTheoSPGiamDan() {
        for (int i = 0; i < soLuongCongNhan - 1; i++) {
            for (int j = 0; j < soLuongCongNhan - i - 1; j++) {
                if (danhSach[j].getmSoSP() < danhSach[j + 1].getmSoSP()) {
                    // Hoán đổi vị trí của công nhân j và j+1
                    CongNhan temp = danhSach[j];
                    danhSach[j] = danhSach[j + 1];
                    danhSach[j + 1] = temp;
                }
            }
        }
    }
}
