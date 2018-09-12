import java.sql.Driver;
import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;
import java.sql.SQLException;

class ConnectionDemo {
public static void main (String [] abc)  throws SQLException{

Driver d = new OracleDriver();
DriverManager.registerDriver(d);
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
System.out.println("hai");










}
}