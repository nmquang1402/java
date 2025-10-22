/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;

import java.sql.*;
import java.util.*;
/**
 *
 * @author Acer
 */
public class XLKH {
    Connection conn;
    
    public void getCon(){
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DLKH;integratedSecurity=true;encrypt=false;");
            System.out.println("Successed");
            
        } catch (Exception e) {
            System.out.println("Failed" + e.getMessage());
        }
    }
    
    public void getKH(){
        
    }
    
    public void insertSP(){
        
    }
}
