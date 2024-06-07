package rowSet;

import java.sql.*;
import javax.sql.rowset.*;

public class RowSetPrac {
    public static void main(String [] args) {
        try {
       
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bcalab", "root", "");
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery("SELECT * FROM fruits");

          
                RowSetFactory rsf = RowSetProvider.newFactory();
                CachedRowSet crs = rsf.createCachedRowSet();
                crs.populate(rs);

          
                while (crs.next()) {
                    System.out.println(crs.getInt(1) + " " + crs.getString(2));
                }
            
        } catch (Exception e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
