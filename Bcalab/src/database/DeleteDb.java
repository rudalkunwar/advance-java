
package database;
import java.sql.*;
public class DeleteDb {
    public static void main(String[] args){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcalab","root","");
          String delete = "Delete from students where id = 2";
          Statement st = con.createStatement();
         System.out.println( st.executeUpdate(delete)>0?"Delete sucess":"Delete failed");
         st.close();
         con.close();
      }catch(Exception e){
          System.out.println(e);
      }
    }
    }