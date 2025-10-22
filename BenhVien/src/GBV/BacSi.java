/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GBV;

/**
 *
 * @author Acer
 */
public class BacSi extends NhanVien{
    
    private String Khoa;

    public BacSi() {
    }

    public BacSi(String Khoa, String Ma, String HoTen, String GT, int Luong) {
        super(Ma, HoTen, GT, Luong);
        this.Khoa = Khoa;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }
    
    

    @Override
    public int tinhLuongThuong(int Luong) {
        return (int) (0.8 * Luong);
    }
    
}
