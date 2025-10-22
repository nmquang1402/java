/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;

/**
 *
 * @author Acer
 */
public class Khachhang extends Person{
    String dc;
    double sdtk;

    public Khachhang(){}
    
    public Khachhang(String dc, double sdtk, String stk, String hoten, String gt) {
        super();
        this.dc = dc;
        this.sdtk = sdtk;
    }

    public String getDc() {
        return dc;
    }

    public double getSdtk() {
        return sdtk;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public void setSdtk(double sdtk) {
        this.sdtk = sdtk;
    }

    @Override
    public String khuyenmai(){
        if (this.gt == "Nữ") return "Khuyến mãi";
        else return null;
    }
}
