
package prepaidStatement;

import java.sql.*;
public class Pupdate {
    public static void main(String[] args){
    try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcalab","root","");
         PreparedStatement pst = con.prepareStatement("update students set name = ? where id = ? ");
  
         pst.setString(1,"raaj");
         pst.setInt(2,1);
         
         System.out.println( pst.executeUpdate()>0?"Update sucess":"update failed");
         pst.close();
         con.close();
      }catch(Exception e){
          System.out.println(e);
      }
}
}
