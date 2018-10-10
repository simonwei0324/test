/**
 * 
 */
package centremedical;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

/**
 * @author weiliu
 *
 */


public class DBAccess {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        /**
         * 3306 is the default port for MySQL in XAMPP. Note both the 
         * MySQL server and Apache must be running. 
         */
        String url = "jdbc:mysql://192.168.64.2:3306/LIU";

        /**
         * The MySQL user.
         */
        String user = "LIU";

        /**
         * Password for the above MySQL user. If no password has been 
         * set (as is the default for the root user in XAMPP's MySQL),
         * an empty string can be used.
         */
        String password = "";

        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connecté");
            java.sql.Statement stt = con.createStatement();
           
            
            ResultSet res = stt.executeQuery("SELECT * FROM tab_acte");
            while (res.next()){
                System.out.println(res.getString(1) + " " + res.getString(2));
            }
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    }
