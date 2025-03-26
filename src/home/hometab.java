package home;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hometab {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\USER\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
  

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
		driver.get("https://bot-staging.kodexia.ai/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[1]/div/div[2]/input")).sendKeys("usman.ahmed@kodexolabs.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[3]/div/div[2]/input")).sendKeys("Test12345");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[4]/button/div")).click();
		
		//hometab
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		WebElement home = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div[2]/a[1]")));
    	home.click();
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        
    	//Day Button
        Thread.sleep(1500);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[1]/div/label[1]/span")).click();
    	Thread.sleep(1500);
    	
    	//Month Button
    	Thread.sleep(1500);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[1]/div/label[2]/span")).click();
    	Thread.sleep(1500);
    	
    	//Year Button
    	Thread.sleep(1500);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[1]/div/label[2]/span")).click();
    	Thread.sleep(1500);
    	
        driver.quit();
    }}
