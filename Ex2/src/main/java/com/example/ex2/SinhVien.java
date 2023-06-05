package com.example.ex2;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien(){
        //Constructor mặc định
        this.maSV= 0;
        this.hoTen = "";
        this.diemLT = 0.0F;
        this.diemTH = 0.0F;
    }
    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public void setMaSV(int maSV) {
        if (maSV > 0){
            this.maSV = maSV;
        }
    }

    public void setHoTen(String hoTen) {
        if (!hoTen.isEmpty()){
            this.hoTen = hoTen;
        }
    }

    public void setDiemLT(float diemLT) {
        if (diemLT >= 0.0 && diemLT <= 10.0) {
            this.diemTH = diemLT;
        } else {
            System.out.println("Điểm LT không hợp lệ. Vui lòng nhập lại từ 0.0 đến 10.0.");
        }
    }

    public void setDiemTH(float diemTH) {
        if (diemTH >= 0.0 && diemTH <= 10.0) {
            this.diemTH = diemTH;
        } else {
            System.out.println("Điểm TH không hợp lệ. Vui lòng nhập lại từ 0.0 đến 10.0.");
        }
    }

    public int getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public double tinhDTB() {
        return (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {
        return "Mã sinh viên: " + maSV + "\n" +
                "Họ tên: " + hoTen + "\n" +
                "Điểm LT: " + diemLT + "\n" +
                "Điểm TH: " + diemTH + "\n" +
                "Điểm trung bình: " + tinhDTB();
    }
}
