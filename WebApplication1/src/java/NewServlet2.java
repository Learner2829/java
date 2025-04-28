/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
class dbms {

    dbms() {
    }

    ;
    Connection conn(PrintWriter out) {
        String uname = "root";
        String password = "Akash@123";
        String url = "jdbc:mysql://localhost:3306/db1";
        Connection c1 = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                c1 = DriverManager.getConnection(url, uname, password);
            } catch (SQLException ex) {
                out.println("Driver not found");
            }
        } catch (ClassNotFoundException ex) {
            out.println("Class not found");
        }

        return c1;
    }
}

public class NewServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            PrintWriter out = response.getWriter();
            dbms db1 = new dbms();
            Connection c1 = db1.conn(out);
            String query = "select * from tb1";
            PreparedStatement s1 = c1.prepareStatement(query);
            ResultSet rs = s1.executeQuery();
            out.println("<html>"
                    + "<body>"
                    + "<table border=2px>"
                    + "<tr>"
            );
            out.println("<th>");
            out.println("Username");
            out.println("</th>");
            out.println("<th>");
            out.println("Password");
            out.println("</th>");
            out.println("</tr>");

            while (rs.next()) {
                String uname = rs.getString("username");
                String password = rs.getString("password");
                out.println("<tr>");
                out.println("<td>");
                out.println(uname);
                out.println("</td>");
                out.println("<td>");
                out.println(password);
                out.println("</td>");
                out.println("</tr>");
            }

            out.println("</table>"
                    + "</body>"
                    + "</html>"
            );
            
            c1.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewServlet2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
