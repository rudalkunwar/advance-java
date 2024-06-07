package prepaidStatement;
import java.sql.*;
public class Pdisplay{
     public static void main(String[] args){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcalab","root","");
            String display = "Select * from students";
            PreparedStatement st = con.prepareStatement(display);
            ResultSet rs = st.executeQuery(display);
            
            while(rs.next()){
                System.out.println("The id of student is "+rs.getInt(1));               
                System.out.println("The name of student is "+rs.getString(2));
                System.out.println("The rollno of student is "+rs.getInt(3));
                System.out.println("The address of student is "+rs.getString(4));
                System.out.print("\n");
            }
            con.close();
            st.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}