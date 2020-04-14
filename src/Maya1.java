import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Maya1 {

	public static void main(String[] args) throws InterruptedException, SQLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A674611\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.navigate().to("https://www.youtube.com");
		driver.manage().window().maximize();
	
		String host = "localhost";
		String port = "3306";
		Connection con = DriverManager.getConnection("jdbc.mysql://"+host+":"+port+"/databasename","SITREAD","SITREAD");
		Statement s = con.createStatement();
		ResultSet Rs = s.executeQuery("select * from customer_all");
		while (Rs.next()) {
		System.out.println(Rs.getString("customerid"));
		driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys(Rs.getString("customerid"));
		}
		
	
	    driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("Boruto Latest episode");
		driver.findElement(By.xpath("//button[@id = 'search-icon-legacy']")).click();
		Thread.sleep(5000);
	

	}

}
