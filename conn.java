import java.sql.*;

public class conn {

	   Connection c;
	    Statement s;
	    conn() {
	        try {
	            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/resume", "root", "0000"); // replace the password according to your account
	            s = c.createStatement();
	        } catch (Exception e) {
	        }
	    }
	

}
