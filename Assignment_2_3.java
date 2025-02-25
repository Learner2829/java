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
public class Assignment_2_3 {
    public static Connection conn(){
        Connection c1 = null;
        String uname="root";
        String pass="";
        String url = "jdbc:mysql://localhost:3306/students";
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c1 = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Succesful");
        }
        catch(Exception e){
        System.out.println("Error:"+e);
        }
        return c1;
    }
   public static void update(String stu_id,String stu_name,String stu_sem,String mobile ){
       String q1 = "update new_students "
               + "set stu_name = ?,"
               + "stu_sem = ?,"
               + "mobile = ?"
               + "where stu_id = ?";
       Connection c1 = conn();
       try{
       
       PreparedStatement p1 = c1.prepareStatement(q1);
       
        p1.setString(1,stu_name);
        p1.setString(2,stu_sem);
        p1.setString(3,mobile);
        p1.setString(4,stu_id);
        int rows = p1.executeUpdate();
        System.out.print(rows);
       }
       catch(SQLException e){
             System.out.println("Error:"+e);
       }
   }
    public static void main(String[] args){
//        Connection c1 = conn();
            update("12","Ashish","5","8888888888");
    
    }
    
}
