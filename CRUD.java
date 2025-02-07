import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUD{
    public static Connection connected(){
        String url ="jdbc:mysql://localhost:3306/CRUD_Ashish";
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
    public static void create_table(Connection conn,String t_name,String fild_data){
    String bracket = "("+fild_data+");";
    String q3 = "create table "+t_name+bracket;
//    System.out.println(q3);
    try{
        Statement s2 = conn.createStatement();
        s2.execute(q3);
        System.out.println("Your Table is Created...");
    }
    catch(SQLException e){
        System.out.print(e.getMessage());
    }
    }
    public static void table_strcuture(Connection con,String table_name){
           
        try{
            DatabaseMetaData databaseMetaData = con.getMetaData();
        
            ResultSet resultSet = databaseMetaData.getColumns(null, null, table_name, null);
            
            // Step 4: Process the result set to display the column names and data types
            System.out.println("Table structure for: " + table_name);
            System.out.println("Column Name\tData Type");
            System.out.println("-----------------------------------");
            
            while (resultSet.next()) {
                String columnName = resultSet.getString("COLUMN_NAME");
                String columnType = resultSet.getString("TYPE_NAME");
                // Print column name and type
                System.out.println(columnName + "\t\t\t" + columnType);
            }
         
        }
        catch(SQLException e){System.out.print(e.getMessage());}   
    }
    public static void main(String[] args) {
        Connection c1 = connected();
//        Create_Database(c1, "CRUD_Ashish");
//        create_table(c1,"Student","ROll int,Name varchar(255)");
        table_strcuture(c1,"tb1");
 }
}
