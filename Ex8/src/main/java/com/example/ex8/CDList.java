package com.example.ex8;

public class CDList {
    private CD[] cds;
    private int size;

    public CDList(int n) {
        cds = new CD[n];
        size = 0;
    }

    //Kiểm tra mã CD có tồn tại hay chưa
    private boolean contains(int maCD) {
        for (int i = 0; i < size; i++) {
            if (cds[i].getMaCD() == maCD) {
                return true;
            }
        }
        return false;
    }
    public boolean addCD(CD cd) {
        if (size == cds.length || contains(cd.getMaCD())) {
            return false;
        }
        cds[size] = cd;
        size++;
        return true;
    }

    //Số lượng CD
    public int countCDs(){
        return  size;
    }

    //Tổng giá thành của các CD
    public float calculateTotalCost() {
        float totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += cds[i].getGiaThanh();
        }
        return totalCost;
    }

    //Xuất ra thông tin tất cả CD
    public void displayCDs() {
        for (int i = 0; i < size; i++) {
            System.out.println(cds[i]);
        }
    }

    public void giamDanTheoGia() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (cds[j].getGiaThanh() < cds[j + 1].getGiaThanh()) {
                    CD temp = cds[j];
                    cds[j] = cds[j + 1];
                    cds[j + 1] = temp;
                }
            }
        }
    }

    public void tangDanTheoTua() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (cds[j].getTuaCD().compareTo(cds[j + 1].getTuaCD()) > 0) {
                    CD temp = cds[j];
                    cds[j] = cds[j + 1];
                    cds[j + 1] = temp;
                }
            }
        }
    }

    public void show(){
        for (int i = 0; i < size; i++){
            System.out.println(cds[i].toString());
        }
    }
}
