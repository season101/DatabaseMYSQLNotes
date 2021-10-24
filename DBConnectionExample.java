
/**
* Template class to use JDBC Driver to connect java application with our MYSQL Database
*/
// 1. Importing the required packages
import java.sql.*;

public class DBConnectionExample.java{
  public static void main (String[] args) {
    //2. Load the driver and register it.
    try{
      Class.forName("com.sql.jdbc.Driver").newInstance();
    
      //3. Establish the connection with database
      Connection con = DriverManager.getConnection(dburl,username,password);
    
      if(!conn.isClosed()){
        //4. Create the statement
        Statement stmt = con.createStatement();
    
        //5. Execute some query
        ResultSet result = stmt.executeQuery(someSQLQueryStmts);
        
        //6. Process result
        System.out.print("result.getString(ColumnName);
      }
      //7. Close the Connection
      con.close();
    }
    catch(Exception e){
      e.StackTraceElement();
    }
  }
}