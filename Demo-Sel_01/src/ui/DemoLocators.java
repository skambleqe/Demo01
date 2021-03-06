package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoLocators {
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
		
	driver.get("https://developer.salesforce.com/");
    driver.findElement(By.xpath("/html/body/div[5]/div/div/header/div[3]/div/div/div[1]/div[1]/div[1]/a")).click();
    //driver.findElement(By.linkText("Sign Up")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("first_name")).sendKeys("Sandip");
    //driver.findElement(By.id("last_name")).sendKeys("Kamble");
    driver.findElement(By.xpath("//input[starts-with(@id,'last_name')]")).sendKeys("Kambde");
    Thread.sleep(2000);
    driver.findElement(By.id("email")).sendKeys("skamblesfdc@gmail.com");
    driver.findElement(By.id("job_role")).sendKeys("Developer");
    driver.findElement(By.id("company")).sendKeys("SilverCloud");
    Thread.sleep(2000);
    driver.findElement(By.id("country")).sendKeys("India");
    driver.findElement(By.name("user[postal_code]")).sendKeys("44003");
    Thread.sleep(2000);
    driver.findElement(By.id("username")).sendKeys("sandykamble@silvercloud.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"eula_container\"]/label[1]")).isEnabled();
    Thread.sleep(2000);
    //driver.findElement(By.id("submit_btn")).click();
    Thread.sleep(2000);
    //driver.close();
	}

}
