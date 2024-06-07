package prepaidStatement;

import java.sql.*;

public class Pdelete {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcalab","root","");
            PreparedStatement pst = con.prepareStatement("delete from students where id = ?");
            pst.setInt(1, 6); 
            System.out.println(pst.executeUpdate() > 0 ? "Delete success" : "Delete failed");
            pst.close();
            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
