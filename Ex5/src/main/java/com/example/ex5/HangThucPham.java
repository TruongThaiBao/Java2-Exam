package com.example.ex5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    public HangThucPham(String maHang){
        if (maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để rỗng");
        }
        this.maHang = maHang;
        this.tenHang = "xxx";
        this.donGia = 0;
        this.ngaySanXuat = new Date();
        this.ngayHetHan = this.ngaySanXuat;
    }
    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
        if (maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để rỗng");
        }
        this.maHang = maHang;
        this.tenHang = tenHang.isEmpty() ? "xxx" : tenHang;
        this.donGia = donGia >= 0 ? donGia : 0;
        Date currentDate = new Date();
        this.ngaySanXuat = ngaySanXuat.before(currentDate) ? ngaySanXuat : currentDate;
        this.ngayHetHan = ngayHetHan.after(this.ngaySanXuat) ? ngayHetHan : this.ngaySanXuat;
    }

    public void setTenHang(String tenHang) {
        if (!tenHang.isEmpty()) {
            this.tenHang = tenHang;
        }
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        }
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        Date currentDate = new Date();
        if (ngaySanXuat.before(currentDate)) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            this.ngaySanXuat = currentDate;
        }
    }

    public void setNgayHetHan(Date ngayHetHan) {
        if (ngayHetHan.after(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            this.ngayHetHan = this.ngaySanXuat;
        }
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public boolean daHetHan() {
        Date currentDate = new Date();
        return currentDate.after(this.ngayHetHan);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");

        String hetHanStatus = daHetHan() ? "Hết hạn" : "Chưa hết hạn";
        String donGiaFormatted = decimalFormat.format(donGia);

        return "Thông tin hàng thực phẩm:\n" +
                "Mã hàng: " + maHang + "\n" +
                "Tên hàng: " + tenHang + "\n" +
                "Đơn giá: " + donGiaFormatted + "\n" +
                "Ngày sản xuất: " + dateFormat.format(ngaySanXuat) + "\n" +
                "Ngày hết hạn: " + dateFormat.format(ngayHetHan) + "\n" +
                "Trạng thái: " + hetHanStatus;
    }
}
