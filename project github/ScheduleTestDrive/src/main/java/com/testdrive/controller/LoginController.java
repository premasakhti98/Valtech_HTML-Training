package com.testdrive.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.testdrive.model.CustomerLoginModel;
import com.testdrive.model.CustomerRegModel;
import com.testdrive.model.DealerLoginModel;
import com.testdrive.model.DealerRegModel;

@Controller
public class LoginController {

	@RequestMapping("/CustomerLogin")
	String loginCustomer() {
		return "CustomerLogin";
	}

	@RequestMapping("/DealerLogin")
	String loginDealer() {
		return "DealerLogin";
	}

	@RequestMapping("/CustomerRegister")
	String CustomerRegistration() {
		return "CustomerRegister";
	}

	@RequestMapping("/DealerRegister")
	String DealerRegistration() {
		return "DealerRegister";
	}

	@RequestMapping(value = "/login")
	public String login(Model model) {
		CustomerLoginModel login = new CustomerLoginModel();
		model.addAttribute("login", login);
		return "CustomerLoginModel";
	}

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/testdrive?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";

	@RequestMapping(value = "/customerloginprocess", method = RequestMethod.POST)
	public ModelAndView libloginProcess(HttpServletRequest request, HttpServletResponse httpServletResponse,
			@ModelAttribute("login") CustomerLoginModel login) {
		ModelAndView modelAndView = new ModelAndView("CustomerLoginModel");
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		// System.out.println(uname + " " + pwd);
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
			String sql = "SELECT Username, Password FROM customer";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 4: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				String username = rs.getString("Username");
				String password = rs.getString("Password");
				if ((uname.equals(username)) && (pwd.equals(password))) {
					modelAndView = new ModelAndView("TestDrive");
					return modelAndView;
				}

			}
			// STEP 5: Clean-up environment
			rs.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
		modelAndView = new ModelAndView("CustomerLogin");
		modelAndView.addObject("message", "Username or password invalid");
		return modelAndView;
	}

	@RequestMapping(value = "/dealerloginprocess", method = RequestMethod.POST)
	public ModelAndView libloginProcess(HttpServletRequest request, HttpServletResponse httpServletResponse,
			@ModelAttribute("login") DealerLoginModel login) {
		ModelAndView modelAndView = new ModelAndView("DealerLoginModel");
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		// System.out.println(uname + " " + pwd);
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
			String sql = "SELECT Username, Password FROM dealer";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 4: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				String username = rs.getString("Username");
				String password = rs.getString("Password");
				if ((uname.equals(username)) && (pwd.equals(password))) {
					modelAndView = new ModelAndView("TestDrive");
					return modelAndView;
				}

			}
			// STEP 5: Clean-up environment
			rs.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
		modelAndView = new ModelAndView("DealerLogin");
		modelAndView.addObject("message", "Username or password invalid");
		return modelAndView;
	}

	@RequestMapping(value = "/login1")
	public String login1(Model model) {
		CustomerRegModel login = new CustomerRegModel();
		model.addAttribute("login1", login);
		return "CustomerRegModel";
	}

	@RequestMapping(value = "/customerregisterprocess", method = RequestMethod.POST)
	public ModelAndView CustomerRegProcess(HttpServletRequest request, HttpServletResponse httpServletResponse,
			@ModelAttribute("login") CustomerRegModel Customerreg) {
		ModelAndView modelAndView = new ModelAndView("CustomerRegModel");
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 1: Register JDBC driver
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// STEP 2: Open a connection
			System.out.println("Connected database successfully...");
			stmt = conn.createStatement();

			String name = Customerreg.getName();
			String email = Customerreg.getEmail();
			int phone = Customerreg.getPhone();
			String city = Customerreg.getCity();
			String username = Customerreg.getUsername();
			String password = Customerreg.getPassword();
			// System.out.println( name+" "+email+""+phone+" "+city+"
			// "+username+" "+password);
			String sql = "INSERT into customer(Name,Email,Phone,City,Username,Password) VALUES ('" + name + "','"
					+ email + "'," + phone + ",'" + city + "','" + username + "','" + password + "')";
			stmt.execute(sql);
			modelAndView = new ModelAndView("CustomerLogin");
			return modelAndView;

		} catch (SQLException e) {
			e.printStackTrace();
			return modelAndView = new ModelAndView("CustomerRegister");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			return modelAndView = new ModelAndView("CustomerRegister");
		}

	}

	@RequestMapping(value = "/login2")
	public String login2(Model model) {
		DealerRegModel login = new DealerRegModel();
		model.addAttribute("login1", login);
		return "DealerRegModel";
	}

	@RequestMapping(value = "/dealerregisterprocess", method = RequestMethod.GET)
	public ModelAndView DealerRegProcess(HttpServletRequest request, HttpServletResponse httpServletResponse,
			@ModelAttribute("login") DealerRegModel Dealerreg) {
		ModelAndView modelAndView = new ModelAndView("CustomerRegModel");
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 1: Register JDBC driver
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// STEP 2: Open a connection
			System.out.println("Connected database successfully...");
			stmt = conn.createStatement();

			String name = Dealerreg.getName();
			String branch = Dealerreg.getBranch();
			String location = Dealerreg.getLocation();
			String email = Dealerreg.getEmail();
			int phone = Dealerreg.getMobileno();
			String username = Dealerreg.getUsername();
			String password = Dealerreg.getPassword();
			System.out.println( name+" "+branch+""+location+" "+email+" "+phone+" "+username+""+password);
			String sql = "INSERT into dealer(Name,Branch,Location,Email,Mobile_no,Username,Password) VALUES ('" + name
					+ "','" + branch + "','" + location + "','" + email + "'," + phone + ",'" + username + "','"
					+ password + "')";
			stmt.execute(sql);
			modelAndView = new ModelAndView("DealerLogin");
			return modelAndView;

		} catch (SQLException e) {
			e.printStackTrace();
			return modelAndView = new ModelAndView("DealerRegister");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			return modelAndView = new ModelAndView("DealerRegister");
		}
	}
}
