package com.example.ex7;

import java.text.DecimalFormat;

public class HinhTron {
    private ToaDo tam = new ToaDo();
    private double banKinh;

    public HinhTron(){
        //Constructor mặc định
    }
    public HinhTron(ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public ToaDo getTam() {
        return tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        double chuVi = 2 * Math.PI * banKinh;
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        return Double.parseDouble(decimalFormat.format(chuVi));
    }

    public double tinhDienTich() {
        double dienTich = Math.PI * Math.pow(banKinh, 2);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        return Double.parseDouble(decimalFormat.format(dienTich));
    }
}
