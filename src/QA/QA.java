package QA;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QA {

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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		WebElement session = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div[2]/a[5]")));
    	session.click();
    	
    	//New Entry Button
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[2]/a/div")).click();
    	Thread.sleep(200);
    	
    	//Question Button
    	
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div/div/div[1]/button[1]")).click();
    	Thread.sleep(200);
    	
    	//Question Field
    	Thread.sleep(200);
    	 WebElement button= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div/div/div[1]/input"));
    	 button.sendKeys("Is YourTeacher Ai is the project of kodexo");
    	 
    	//Answer Button
    	 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div/div/div[1]/button[2]")).click();
    	Thread.sleep(200);
    	
    	//Answer Field
    	
    	WebElement button1= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div/div/div[1]/input[2]"));
   	    button1.sendKeys("Yes, YourTeacher is the project which kodexolabs is delivering");
   	    Thread.sleep(10000);
   	    
   	    //save button 
   	    
   	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div/div/div[2]/button[1]")).click();
   	    Thread.sleep(200);
   	 
   	    //back button 
   	    
   	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[1]/a/img")).click();
   	 Thread.sleep(5000);
    	
   	    //search bar 
   	    WebElement button2= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[1]/div/input"));
	    button2.sendKeys("Yes");
	    Thread.sleep(2000);
   	    
	    WebElement button3= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[1]/div/input"));
	    button3.sendKeys("no");
    	driver.quit();
    }}
    	