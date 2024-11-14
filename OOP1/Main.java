package OOP1;
import java.sql.*;
public class Main {
  private static final String url="jdbc:mysql://localhost:3306/myDb";
  private static final String username="root";
  private static final String pass="Aditya2003";
  public static void main(String[] args) {
     try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
     
       System.out.println(e.getMessage());
    }
    try{
        Connection conn = DriverManager.getConnection(url, username, pass);
        Statement st = conn.createStatement();
        String query="SELECT * FROM mytb";
        ResultSet rs=st.executeQuery(query);
        while(rs.next()){
          int id=rs.getInt("id");
          String name=rs.getString("name");
          int age=rs.getInt( "age");
          System.out.println(id);
          System.out.println(name);
          System.out.println(age);
          System.out.println();
        }
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
  }
}
