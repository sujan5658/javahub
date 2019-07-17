
package jdbc;
import java.sql.Connection;
//import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DBConnect {
    String url = "jdbc:mysql://localhost/java";
    String user = "sujan";
    String pass = "Difficult@5658";
    public DBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  //load Driver
            //Class.forName("org.gjt.mm.mysql.Driver");  //This can be also used
            Connection con = (Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("Connected");
            //Insert update delete or select
            String sql = "insert into tbl_person(id,name,address)values(42,'Sujan Koju','Bhaktapur')";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            con.close();
            System.out.println("Database Closed");
        }
        catch(Exception er){
            System.out.println(er);
        }
    }
    public static void main(String[] args){
        new DBConnect();
    }
}
