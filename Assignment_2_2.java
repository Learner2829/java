/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignmnet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author rcc
 */
public class Assignmnet_2_2 {
    public static Connection conn(){
        String uname = "root";
        String pass = "";
        String db_url = "jdbc:mysql://localhost:3306/students";
        Connection c1 = null;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c1 = DriverManager.getConnection(db_url,uname,pass);
        System.out.println("Connection Succesfuly...");
        return c1;
        }
        catch(Exception e){
            System.out.println("Error:"+e);
            return c1;
        } 
    }
    public static void insert(String stu_id,String stu_name,String stu_sem,String mobile){
        Connection c1 = conn();
        String q1 = "insert into new_students value(?,?,?,?)";
        try{
        PreparedStatement p1 = c1.prepareStatement(q1);
        p1.setString(1,stu_id);
        p1.setString(2,stu_name);
        p1.setString(3,stu_sem);
        p1.setString(4,mobile);
        int result = p1.executeUpdate();
        System.out.print(result);
        }
        catch(SQLException e){
            System.out.println("Error"+e);
        }
        
        
    
    }
    public static void main(String[] args){
//        Connection c1 = conn();
//        insert("12","Sanjay","6","9999999999");
           
        
    }
}
