/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GBV;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Acer
 */
public class XLDL {
    Connection conn;
    
    public void getCon(){
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DLSach;integratedSecurity=true;encrypt=false;");
            System.out.println("getcon success");
        } catch (Exception e) {
            System.out.println("getcon failed" + e.getMessage());
        }
    }
    
    public List<BacSi> getBS(){
        List<BacSi> lbs = new ArrayList<BacSi>();
        getCon();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM tbBacSi");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                BacSi bs = new BacSi(
                        rs.getString("Khoa"),
                        rs.getString("Ma"),
                        rs.getString("HoTen"),
                        rs.getString("GT"),
                        rs.getInt("Luong")
                );
                lbs.add(bs);
            }
        } catch (Exception e) {
            System.out.println("getbs failed" + e.getMessage());
        }
        return lbs;
    }
    
    
}
