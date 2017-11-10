package testing;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ReadJDBC {


	/*
	public static void main(String args[]) throws Exception {
	
		Statement stat = null;
	    ResultSet rs = null;
		Connection conn =
			DriverManager.getConnection("jdbc:excel:user=myuseraccount;password=mypassword;");
			 
			boolean ret = stat.execute("SELECT * FROM ExcelSheet");
			ResultSet rs=stat.getResultSet();
			while(rs.next()){
			for(int i=1;i<=rs.getMetaData().getColumnCount();i++)
			{
			System.out.println(rs.getMetaData().getColumnName(i) +"="+rs.getString(i));
			}
			}
	}
	*/
	
	

	  public static Connection getConnection(String username, String password) throws Exception {
	    String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	    String url = "jdbc:odbc:dsn_name";
	    //String username = "yourName";
	    //String password = "yourPass";
	    Class.forName(driver);
	    
		return	DriverManager.getConnection("jdbc:excel:user=myuseraccount;password=mypassword;");
	  //  return DriverManager.getConnection(url, username, password);
	  }

	  public static void main(String args[]) throws Exception {
	    Connection conn = null;
	    Statement stmt = null;
	    ResultSet rs = null;

	    conn = getConnection("yourName","yourPass");
	    stmt = conn.createStatement();
	    String excelQuery = "select * from [Sheet1$]";
	    rs = stmt.executeQuery(excelQuery);

	    while (rs.next()) {
	      System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
	    }
	    
	    rs.close();
	    stmt.close();
	    conn.close();
	  }
	  
	
	  
	}

