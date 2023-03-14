package learn_db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_MySQL 
{
public static void main(String[] args) throws SQLException {
	
	String host ="localhost:3306";
	//establishing connection
	Connection connection = DriverManager.getConnection("jdbc:mysql://"+host+"/Learn_selenium_db","root","rootMe@1");
	
	//creating a statement 
	Statement Statement = connection.createStatement();
	
	//sending the query
	ResultSet resultset = Statement.executeQuery("select * from login_cred where SNo = 1;");
	
	
	//poin it to the next index
	
	//print the output
	
	
	System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\Sabari Nathan\\Documents\\JAVA-SELNIUM\\drivers\\chromedriver.exe");
	
	
	//xhrome options
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");

	//Just pass this 'ops' object to ChromeDriver() as argument

	ChromeDriver driver= new ChromeDriver(ops) ;
	
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/client");
	while(resultset.next())
	{
	driver.findElement(By.cssSelector("#userEmail")).sendKeys(resultset.getString("username"));
	driver.findElement(By.cssSelector("#userPassword")).sendKeys(resultset.getString("passw"));	
	System.out.println(resultset.getString("username"));
	System.out.println(resultset.getString("passw"));
	
	}
	driver.findElement(By.cssSelector("#login")).click();
}
}
