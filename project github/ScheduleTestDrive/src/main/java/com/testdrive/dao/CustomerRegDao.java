package com.testdrive.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.web.servlet.ModelAndView;

import com.testdrive.model.CustomerRegModel;
public class CustomerRegDao {

public static boolean addBooks(CustomerRegModel Customerreg)  {
final String JDBC_DRIVER="com.mysql.jdbc.Driver";
final String DB_URL = "jdbc:mysql://localhost:3306/testdrive?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
final String USER = "root";
final String PASS = "";
Connection conn = null;
Statement stmt = null;
try {
// STEP 1: Register JDBC driver
Class.forName(JDBC_DRIVER);

// STEP 2: Open a connection
System.out.println("Connecting to database...");
conn = DriverManager.getConnection(DB_URL, USER, PASS);

// STEP 3: Execute a query
System.out.println("Connected database successfully...");
stmt = conn.createStatement();

String name=Customerreg.getName();
String email=Customerreg.getEmail();
int phone=Customerreg.getPhone();
String city=Customerreg.getCity();
String username=Customerreg.getUsername();
String password=Customerreg.getPassword();
System.out.println( name+" "+email+""+phone+" "+city+" "+username+" "+password);
String sql = "INSERT into customer(Name,Email,Phone,City,Username,Password) VALUES ('"+name+"','"+email+"','"+phone+"',"+city+",'"+username+"','"+password+"')";
stmt.execute(sql);

}catch (SQLException e){
e.printStackTrace();

} catch (ClassNotFoundException e) {

e.printStackTrace();
}

return true;

}
}
