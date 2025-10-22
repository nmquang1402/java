/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GBV;

/**
 *
 * @author Acer
 */
public abstract class NhanVien {
    private String Ma;
    private String HoTen;
    private String GT;
    private int Luong;

    public NhanVien() {
    }

    public NhanVien(String Ma, String HoTen, String GT, int Luong) {
        this.Ma = Ma;
        this.HoTen = HoTen;
        this.GT = GT;
        this.Luong = Luong;
    }

    public String getMa() {
        return Ma;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getGT() {
        return GT;
    }

    public int getLuong() {
        return Luong;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }
    
    public abstract int tinhLuongThuong(int Luong);
}
