import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnectsql1 
{
    Connection conn=null;
    public static Connection Connect_DB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","mk24643700@@msit");
            return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
