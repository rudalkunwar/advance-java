package scrollable;
import java.sql.*;

public class Supdate {
    
    public static void main(String[] args){
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcalab", "root", "");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            // int res = st.executeUpdate("CREATE TABLE fruits (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), price FLOAT)");
            ResultSet res = st.executeQuery("SELECT * FROM fruits");
            res.absolute(5);
            System.out.println("Before updation");
            Display(res);
           float currentPrice = res.getFloat("price");
           res.updateFloat("price", currentPrice+3);
           res.updateRow();
           System.out.println("Before updation");
            Display(res);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void Display(ResultSet rs){
        try{
            System.out.println("Fruit id: " + rs.getInt("id"));
            System.out.println("Fruit name: " + rs.getString("name"));
            System.out.println("Fruit price: " + rs.getFloat("price"));
        } catch(Exception e){
            System.out.println(e);
        }
    }
}

