/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GBV;

import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class GUI_insertBS extends JFrame{
    JTextField tfMa, tfHoTen, tfGT, tfLuong;
    JComboBox<String> cbKhoa;
    JButton btThem;
    JTable tb;
    XLDL xldl;
    DefaultTableModel model;
    
    public GUI_insertBS(){
        new JFrame("Thêm bác sĩ");
        getContentPane();
        setBounds(50, 50, 1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
  
        tfMa = new JTextField();
        tfMa.setBounds(50, 50, 100, 40);
        tfMa.setBorder(BorderFactory.createTitledBorder("Mã"));
        
        tfHoTen = new JTextField();
        tfHoTen.setBounds(50, 80, 100, 50);
        tfHoTen.setBorder(BorderFactory.createTitledBorder("Họ Tên"));
        
        String[] lk = {"Tim mạch", "Chỉnh hình", "Xương"};
        cbKhoa = new JComboBox<String>(lk);
        cbKhoa.setBounds(50, 120, 100, 50);
        
        add(tfMa);
        add(cbKhoa);
        
        XLDL xldl = new XLDL();
        loadBS();
    }
    
    private void loadBS(){
        List<BacSi> lbs = xldl.getBS();
        for(BacSi bs : lbs){
            
        }
    }
    
    public static void main(String[] args) {
        GUI_insertBS insertbs = new GUI_insertBS();
        insertbs.setVisible(true);
        XLDL xldl = new XLDL();
        xldl.getCon();
    }
}
