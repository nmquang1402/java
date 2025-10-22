/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSach;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class GUI_findSA extends JFrame{
    
    
    JComboBox<String> cb;
    JTextField tf;
    JButton bt;
    JTable tb;    
    DefaultTableModel model;
    List<Sach> list;
    XLSach xls;
    
    public GUI_findSA(){
        new JFrame("Quan ly sach");
        getContentPane();
        setBounds(50, 50, 1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        tf = new JTextField();
        tf.setBorder(BorderFactory.createTitledBorder("Giá bán"));
        tf.setBounds(50, 60, 70, 30);
        
        String[] cbl = {"Kim Đồng", "Thanh niên"};
        cb = new JComboBox<String>(cbl);
        cb.setBounds(50, 120, 70, 30);
        
        model = new DefaultTableModel(new String[]{"Mã sách", "Tên sách", "Nhà XB", "Năm XB", "Giá bán", "Khuyến mãi"}, 0);
        tb = new JTable(model);
        JScrollPane sp = new JScrollPane(tb);
        sp.setBounds(200, 50, 700, 100);
        
        bt = new JButton("Tìm");
        bt.setBounds(50, 170, 70, 30);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tim();
            }
        });
        
        add(tf);
        add(cb);
        add(sp);
        add(bt);
        
        xls = new XLSach();
        loadSach();
        
        
        
    }
    
    private void tim(){
        try {
            String nhaXB = cb.getSelectedItem().toString();
            int giaB = Integer.parseInt(tf.getText());
            List<Sach> list = xls.getSAbyNXBGB(nhaXB, giaB);
            hienThiSach(list);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giá bán hợp lệ!");
        }
    }
    
    private void loadSach(){
        List<Sach> list = xls.getSA();
        hienThiSach(list);
    }
    
    private void hienThiSach(List<Sach> list) {
        model.setRowCount(0);
        for(Sach s : list) {
            model.addRow(new Object[]{
                s.getMaS(),
                s.getTenS(),
                s.getNhaXB(),
                s.getNamXB(),
                s.getGiaB(),
            });
        }
    }
    
    public static void main(String[] args) {
        GUI_findSA fsa = new GUI_findSA();
        fsa.setVisible(true);
        XLSach xls = new XLSach();
        xls.getCon();
    }

}
