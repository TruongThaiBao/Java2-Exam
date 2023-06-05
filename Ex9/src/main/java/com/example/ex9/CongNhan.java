package com.example.ex9;

public class CongNhan {
    private int maCN;
    private String mHo;
    private String mTen;
    private int mSoSP;

    public CongNhan(){
        //Constructor mặc định
    }
    public CongNhan(int maCN, String mHo, String mTen, int mSoSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public void setmSoSP(int mSoSP) {
        if (mSoSP <= 0){
            throw new IllegalArgumentException("Số sản phẩm không hợp lệ!");
        }
        this.mSoSP = mSoSP;
    }

    public int getMaCN() {
        return maCN;
    }

    public String getmHo() {
        return mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    //Tính lương
    public double tinhLuong(){
        if (mSoSP < 199){
            return mSoSP*0.5;
        }else if (mSoSP >= 200 && mSoSP <399){
            return mSoSP*0.55;
        }else if (mSoSP >= 400 && mSoSP <599){
            return mSoSP*0.6;
        }else{
            return mSoSP*0.65;
        }
    }

    @Override
    public String toString(){
        return "Mã CN: " + maCN +
                "\nHọ và tên: " + mHo + " " + mTen +
                "\nSố sản phẩm: " + mSoSP;
    }
}
