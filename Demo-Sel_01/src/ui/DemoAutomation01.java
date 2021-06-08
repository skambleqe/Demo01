package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoAutomation01 {
	public static String browser="chrome";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
	if(browser.equals("Edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\BrowserDriver\\msedgedriver.exe");
		driver=new EdgeDriver();
	}else if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
		
	driver.get("https://www.saucedemo.com/");
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    Thread.sleep(2000);
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
        Thread.sleep(2000);
        driver.close();
	}

}
