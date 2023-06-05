package com.example.ex8;

public class CD {
    private int maCD;
    private String tuaCD;
    private int soBH;
    private float giaThanh;

    public CD(){
        //Constructor mặc định
        this.maCD = 999999;
        this.tuaCD = "Chưa xác định";
    }

    public CD(int maCD, String tuaCD, int soBH, float giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.soBH = soBH;
        this.giaThanh = giaThanh;
    }

    public void setMaCD(int maCD) {
        if (maCD <= 0){
            throw new IllegalArgumentException("Mã CD không hợp lệ");
        }
        this.maCD = maCD;
    }

    public void setTuaCD(String tuaCD) {
        if (tuaCD.isEmpty()){
            throw new IllegalArgumentException("Tựa CD không được để rỗng");
        }
        this.tuaCD = tuaCD;
    }

    public void setSoBH(int soBH) {
        if (soBH <= 0){
            throw new IllegalArgumentException("Số bài hát không hợp lệ");
        }
        this.soBH = soBH;
    }

    public void setGiaThanh(float giaThanh) {
        if (giaThanh <= 0){
            throw new IllegalArgumentException("Giá không hợp lệ");
        }
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public int getSoBH() {
        return soBH;
    }

    public float getGiaThanh() {
        return giaThanh;
    }
    @Override
    public String toString() {
        return "CD{" +
                "maCD=" + maCD +
                ", tuaCD='" + tuaCD + '\'' +
                ", soBH=" + soBH +
                ", giaThanh=" + giaThanh +
                '}';
    }
}
