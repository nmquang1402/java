/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSach;

import java.sql.*;
import java.util.*;
/**
 *
 * @author Acer
 */
public class XLSach implements ISach{
    
    Connection conn;

    @Override
    public void getCon() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DLSach;integratedSecurity=true;encrypt=false;");
            System.out.println("getCon success");
        } catch (Exception e) {
            System.out.println("getCon error" + e.getMessage());
        }
    }

    @Override
    public List<Sach> getSA() {
        List<Sach> list = new ArrayList<>();
        getCon();
        String sql = "SELECT * FROM tbSach";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Sach s = new Sach(
                    rs.getString("MaS"),
                    rs.getString("TenS"),
                    rs.getString("NhaXB"),
                    rs.getInt("NamXB"),
                    rs.getInt("GiaB")
                );
                list.add(s);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Sach> getSAbyNXBGB(String NhaXB, int GiaB) {
        List<Sach> list = new ArrayList<>();
        getCon();
        String sql = "SELECT * FROM tbSach WHERE NhaXB = ? AND GiaB <= ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, NhaXB);
            ps.setInt(2, GiaB);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Sach s = new Sach(
                    rs.getString("MaS"),
                    rs.getString("TenS"),
                    rs.getString("NhaXB"),
                    rs.getInt("NamXB"),
                    rs.getInt("GiaB")
                );
                list.add(s);
            }
            rs.close();
            ps.close();
            conn.close(); // Đóng kết nối sau khi dùng
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
