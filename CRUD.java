import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUD{
    public static Connection connected(){
        String url ="jdbc:mysql://localhost:3306/CRUD";
        String uname = "root" ;
        String Password = "";
        Connection c1= null;
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           c1 = DriverManager.getConnection(url,uname,Password);
            return c1;
        }
        catch(SQLException e){
             System.out.print(e.getMessage());
             return c1;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            return c1;
        }
    }
    public static void Create_Database(Connection c1,String db_name){
    try{
            String Q1 = "CREATE DATABASE "+db_name;
            Statement s1 = c1.createStatement();
            s1.executeUpdate(Q1);
            System.out.print(db_name+" Database Created...");
    }
            catch(SQLException e){
             System.out.print(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Connection c1 = connected();
        Create_Database(c1, "DEV");
 }
}
