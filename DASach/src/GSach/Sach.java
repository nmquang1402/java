/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSach;

/**
 *
 * @author Acer
 */
public class Sach {
    private String MaS;
    private String TenS;
    private String NhaXB;
    private int NamXB;
    private int GiaB;

    public Sach() {
    }
    
    public Sach(String MaS, String TenS, String NhaXB, int NamXB, int GiaB) {
        this.MaS = MaS;
        this.TenS = TenS;
        this.NhaXB = NhaXB;
        this.NamXB = NamXB;
        this.GiaB = GiaB;
    }

    public String getMaS() {
        return MaS;
    }

    public String getTenS() {
        return TenS;
    }

    public String getNhaXB() {
        return NhaXB;
    }

    public int getNamXB() {
        return NamXB;
    }

    public int getGiaB() {
        return GiaB;
    }

    public void setMaS(String MaS) {
        this.MaS = MaS;
    }

    public void setTenS(String TenS) {
        this.TenS = TenS;
    }

    public void setNhaXB(String NhaXB) {
        this.NhaXB = NhaXB;
    }

    public void setNamXB(int NamXB) {
        this.NamXB = NamXB;
    }

    public void setGiaB(int GiaB) {
        this.GiaB = GiaB;
    }
    
    public int Khuyenmai(int NamXB){
        if(NamXB<2019) return 25;
        else return 0;
    }
}
