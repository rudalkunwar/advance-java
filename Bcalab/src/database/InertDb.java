package database;
import java.sql.*;
public class InertDb {
    public static void main(String[] args){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcalab", "root", "");
            Statement st = con.createStatement();
            String insert = "insert into students(id,name,rollno,address)values(6,'bibkek',69,'bindrabasini')";
            System.out.println(st.executeUpdate(insert) > 0 ? "Insert success" : "Insertion failed!!!!");
            st.close();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
      
    }
}
