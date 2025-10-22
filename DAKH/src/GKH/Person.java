/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;

/**
 *
 * @author Acer
 */
public abstract class Person {
    String stk;
    String hoten;
    String gt;

    public Person(){}
    
    public Person(String stk, String hoten, String gt) {
        this.stk = stk;
        this.hoten = hoten;
        this.gt = gt;
    }

    public String getStk() {
        return stk;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGt() {
        return gt;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }
    
    public abstract String khuyenmai();
}
