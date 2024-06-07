
package database;
import java.sql.*;


public class UpdateDb {
    
    public static void main(String[] args){
       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcalab","root","");
            String update = "update students set name = 'ronish' where id = 1";
            Statement st = con.createStatement();
            
            System.out.println(st.executeUpdate(update)>0 ?"Update Sucessfull":"Update failed!!!!!!");
            st.close();
            con.close();
        }catch(Exception e){
            System.out.println("Failed connection");
        }
        
    }
    
}
