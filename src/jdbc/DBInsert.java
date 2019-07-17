
package jdbc;
import java.sql.Connection;
//import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBInsert {
    String url = "jdbc:mysql://localhost/java";
    String user = "sujan";
    String pass = "Difficult@5658";
    int id=0;
    String name="";
    String address="";
    public DBInsert(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  //load Driver
            //Class.forName("org.gjt.mm.mysql.Driver");  //This can be also used
            Connection con = (Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("Connected");
            //Insert update delete or select
            System.out.print("Enter id :");
            id = new Scanner(System.in).nextInt();
            System.out.print("Enter Name : ");
            name = new Scanner(System.in).nextLine();
            System.out.print("Enter Address : ");
            address = new Scanner(System.in).nextLine();
            String sql = "INSERT INTO tbl_person(id,name,address) VALUES(?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            pst.setString(2,name);
            pst.setString(3,address);
            pst.executeUpdate();
            con.close();
            System.out.println("Database Closed");
        }
        catch(Exception er){
            System.out.println(er);
        }
    }
    public static void main(String[] args){
        new DBInsert();
    }
}
