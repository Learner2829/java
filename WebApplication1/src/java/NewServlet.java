/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
class dbms{
    dbms(){};
    Connection conn(PrintWriter out){
        String uname ="root";
        String password ="Akash@123";
        String url ="jdbc:mysql://localhost:3306/db1";
        Connection c1 = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
            c1 = DriverManager.getConnection(url,uname,password);
            } catch (SQLException ex) {
               out.println("Driver not found");
            }
        } catch (ClassNotFoundException ex) {
           out.println("Class not found");
        }
        
        
        return c1;
    }
    void insert_data(PrintWriter out,String uname,String pass){
        try {
            String query = "insert into tb1 value(?,?)";
            Connection c1 = conn(out);
            PreparedStatement p1 = c1.prepareStatement(query);
            p1.setString(1,uname);
            p1.setString(2, pass);
            p1.executeUpdate();
            
            out.println("Data inserted....");
            c1.close();
        } catch (SQLException ex) {
           out.println("Data not inserted...");
           ex.printStackTrace(out);
        }
    }
}

public class NewServlet extends HttpServlet {
            @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
          String user_name = request.getParameter("u_name");
          String password = request.getParameter("pass");
          PrintWriter out = response.getWriter();
          dbms db1 = new dbms();
          db1.insert_data(out, user_name, password);
    }
    }

//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
