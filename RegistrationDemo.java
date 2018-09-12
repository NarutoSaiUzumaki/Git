import java.sql.Driver;
import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;
import java.sql.SQLException;

class RegistrationDemo {
public static void main (String [] abc)  throws SQLException{

Driver d = new OracleDriver();
DriverManager.registerDriver(d);
System.out.println("hai");










}
}