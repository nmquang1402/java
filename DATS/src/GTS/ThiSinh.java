/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GTS;

/**
 *
 * @author Acer
 */
public class ThiSinh {
    private String SoBD;
    private String HoTen;
    private String GT;
    private String NganhH;
    private int TongD;

    public ThiSinh(String SoBD, String HoTen, String GT, String NganhH, int TongD) {
        this.SoBD = SoBD;
        this.HoTen = HoTen;
        this.GT = GT;
        this.NganhH = NganhH;
        this.TongD = TongD;
    }

    public ThiSinh() {
    }

    public String getSoBD() {
        return SoBD;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getGT() {
        return GT;
    }

    public String getNganhH() {
        return NganhH;
    }

    public int getTongD() {
        return TongD;
    }

    public void setSoBD(String SoBD) {
        this.SoBD = SoBD;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public void setNganhH(String NganhH) {
        this.NganhH = NganhH;
    }

    public void setTongD(int TongD) {
        this.TongD = TongD;
    }
    
    public void Xettuyen(int TongD){
        
    }
}
