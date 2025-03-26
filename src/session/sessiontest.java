package session;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sessiontest {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
		driver.get("https://chatbot-admin.kodexolabs.ai/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[1]/div/div[2]/input")).sendKeys("usman.ahmed@kodexolabs.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[3]/div/div[2]/input")).sendKeys("Test12345");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[4]/button/div")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		WebElement session = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div[2]/a[3]")));
    	session.click();
    	
////    Live session's
//    	
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div/div/div[3]/div[1]/button[1]")).click();
    	Thread.sleep(8000);
  	  
////    	favourite button 
    	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement favouritebutton = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div.w-full.relative.flex > div.w-full.overflow-auto.h-\\[100\\%\\].mx-\\[10px\\].pt-\\[23px\\].md\\:ml-\\[240px\\] > div > div > div > div > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div > button:nth-child(2) > img")));
		favouritebutton.click();
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div/div/div[4]/div[1]/div[2]/img")).click();
	    	Thread.sleep(8000);
		
////		delete button 
//    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(200));
//		WebElement deletebutton = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div[1]/div/div[4]/div[2]/div/div/button[2]/img")));
//		deletebutton.click();
		
////    Favourite session's
  	
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div/div/div[3]/div[1]/button[2]")).click();
    	Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div/div/div[4]/div[3]/div[2]/img")).click();
        Thread.sleep(8000);
//		unfavourite button 
//		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(60));
//		WebElement unfavouritebutton = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div[1]/div/div[4]/div[4]/div[1]/div/button[1]/img")));
//		 unfavouritebutton.click();

		
//    	Closed session's
//    	
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div/div/div[3]/div[2]/button[1]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div/div/div[4]/div[5]/div[2]/img")).click();
    	Thread.sleep(4000);
    	
//    Archived session's 
    	
      driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div/div/div[3]/div[2]/button[2]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div/div/div[4]/div[7]/div[2]/img")).click();
      Thread.sleep(4000); 	
//    
     Thread.sleep(8000);
	 driver.quit();
    
    }}