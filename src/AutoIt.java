import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A674611\\Desktop\\chromedriver_1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().to("https://altoconvertpdftojpg.com/");
		driver.findElement(By.xpath("//button[contains(@id,'dropzoneInput')]")).click();
		Runtime.getRuntime().exec("C:\\Users\\A674611\\Documents\\AutoIt\\FileUpload.exe");
		

	}

}
