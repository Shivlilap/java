package Com.lab;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class Helpher {
		
		static {
			try {
				//register driver class
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
		public static Connection conn() throws SQLException{
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/c1495","root","root");
		}
	}

