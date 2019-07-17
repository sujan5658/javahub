
package jdbc;
import java.sql.Connection;
//import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBSelect {
    String url = "jdbc:mysql://localhost/java";
    String user = "sujan";
    String pass = "Difficult@5658";
    public DBSelect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  //load Driver
            //Class.forName("org.gjt.mm.mysql.Driver");  //This can be also used
            Connection con = (Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("Connected");
            //Insert update delete or select
            String sql = "SELECT * FROM tbl_person";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            System.out.println("ID\tName\tAddress");
            while(rs.next()==true){  //If records in rs
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            }
            con.close();
            System.out.println("Database Closed");
        }
        catch(Exception er){
            System.out.println(er);
        }
    }
    public static void main(String[] args){
        new DBSelect();
    }
}
