package api;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class apitab {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\USER\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
		driver.get("https://chatbot-admin.kodexolabs.ai/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[1]/div/div[2]/input")).sendKeys("usman.ahmed@kodexolabs.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[3]/div/div[2]/input")).sendKeys("Test12345");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[4]/button/div")).click();
		
		//scroll down screen
		Thread.sleep(30000);
		WebElement settingsTab = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div[2]/a[6]/span"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", settingsTab);
        js.executeScript("arguments[0].click(true);", settingsTab);
        
        //apitab 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div[2]/a[7]")).click();
        Thread.sleep(2000);
        
        //get read api key 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div/div/div/button/div")).click();
        Thread.sleep(2000);
        
        //copy button
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/button/img")).click();
        Thread.sleep(2000);
        
        //ok button
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/button")).click();
        Thread.sleep(2000);
        
        //documentation
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div/div/p/a")).click();
        Thread.sleep(2000);
        
        //back button of documentation 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[1]/a/img")).click();
        Thread.sleep(2000);
        
        driver.quit();
    }}