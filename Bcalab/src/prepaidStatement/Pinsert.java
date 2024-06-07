
package prepaidStatement;

import java.sql.*;
/**
 *
 * @author ruzal
 */
public class Pinsert {
    
public static void main(String[] args){
    try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcalab","root","");
         PreparedStatement pst = con.prepareStatement("insert into students values (?,?,?,?)");
  
         pst.setInt(1,10);
         pst.setString(2,"raaj");
         pst.setInt(3,16);
         pst.setString(4, "bharatpur");
         
         System.out.println( pst.executeUpdate()>0?"Insert sucess":"Insert failed");
         pst.close();
         con.close();
      }catch(Exception e){
          System.out.println(e);
      }
}
}
