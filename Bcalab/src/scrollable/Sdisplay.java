
package scrollable;
import java.sql.*;
public class Sdisplay {
    public static void main(String[] args){
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcalab","root","");
           Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY );
           ResultSet rs = st.executeQuery("select * from students");
           
           rs.absolute(3);
           
           System.out.println("student id :"+rs.getInt(1));           
           System.out.println("student name :"+rs.getString(2));
           System.out.println("student roll no :"+rs.getInt(3));           
           System.out.println("student id :"+rs.getString(4));
           
           st.close();
           st.close();
       } catch(Exception e){
           System.out.println(e);
       }       
    }
}
