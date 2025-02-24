/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignmnet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author rcc
 */
public class Assignmnet {
    static Connection connection(){
        String uname="root";
        String pass="";
        String url="jdbc:mysql://localhost:3306/students";
        Connection c1 = null;    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c1 = DriverManager.getConnection(url,uname,pass);
            System.out.println("Connection is stablis...");
            return c1;
        }
        catch(Exception e){
            System.out.println("Error:"+e);
            return c1;
        }
    }
    static void fetch_table(Connection c1,String s_name){
    
        String query= "select * from "+s_name;
        
        try{
        Statement stmt = c1.createStatement();
        ResultSet data = stmt.executeQuery(query);  
        
        while(data.next()){
            int e_num = data.getInt("e_num");
            String Name = data.getString("Name");
            String addresh = data.getString("addresh");
            long mobile_num = data.getLong("mobile_num");
            String email = data.getString("email");
           
            System.out.println(
            "e_num:"+ e_num+"\n"+  
            "Name:"+ Name +"\n"+
            "Addresh:"+ addresh +"\n"+
            "Mobile:"+ mobile_num +"\n"+
            "Email:"+ email+"\n" 
            );
            
            
        }
        
        c1.close();
        data.close();
        }
        catch(SQLException e1){
            System.out.println("Error:"+e1);
        }
        
        
    
    }

    public static void main(String[] args) {
        Connection c1 =connection();
        fetch_table(c1,"student_rec");
    }
}
