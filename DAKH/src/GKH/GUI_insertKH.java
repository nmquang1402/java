/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */

class JavaSwing extends JFrame{
    JTextField tfSoTK, tfHoTen, tfSoDu;
    JButton bt;
    JTable tb;
    DefaultTableModel model;
    JComboBox<String> cbGioiTinh, cbDiaChi;
    
    public JavaSwing(){
        setTitle("Quản lý khách hàng");
        setSize(900, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // --- TextFields ---
        tfSoTK = new JTextField(); 
        tfSoTK.setBorder(BorderFactory.createTitledBorder("Số tài khoản"));
        tfSoTK.setBounds(30, 30, 200, 50);
        this.add(tfSoTK);

        tfHoTen = new JTextField();
        tfHoTen.setBorder(BorderFactory.createTitledBorder("Họ tên"));
        tfHoTen.setBounds(30, 90, 200, 50);
        this.add(tfHoTen);

        cbGioiTinh = new JComboBox<>(new String[]{"Nam", "Nữ"});
        cbGioiTinh.setBorder(BorderFactory.createTitledBorder("Giới tính"));
        cbGioiTinh.setBounds(30, 150, 200, 50);
        this.add(cbGioiTinh);

        tfSoDu = new JTextField();
         tfSoDu.setBorder(BorderFactory.createTitledBorder("Số dư"));
        tfSoDu.setBounds(30, 210, 200, 50);
        this.add(tfSoDu);

        // --- ComboBox Địa chỉ ---
        cbDiaChi = new JComboBox<>(new String[]{"Hà Nội", "Hải Phòng", "Nam Định"});
        cbDiaChi.setBorder(BorderFactory.createTitledBorder("Địa chỉ"));
        cbDiaChi.setBounds(30, 270, 200, 50);
        this.add(cbDiaChi);

        // --- Nút Thêm ---
        bt = new JButton("Thêm khách hàng");
        bt.setBounds(250, 270, 200, 40);
        this.add(bt);
        
        // --- JTable hiển thị danh sách ---
        String[] columnNames = {"Số TK", "Họ tên", "Giới tính", "Địa chỉ", "Số dư"};
        model = new DefaultTableModel(columnNames, 0);
        tb = new JTable(model);
        JScrollPane sp = new JScrollPane(tb);
        sp.setBounds(250, 30, 370, 240);
        add(sp);

        // Hiển thị
        setVisible(true);
    }
}

public class GUI_insertKH {
    public static void main(String[] args) {
        JavaSwing js = new JavaSwing();
        XLKH xlkh = new XLKH();
        xlkh.getCon();
    }
}
