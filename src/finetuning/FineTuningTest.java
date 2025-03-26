package finetuning;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FineTuningTest {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\USER\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
		driver.get("https://develop.d2an8hv0ej8jwt.amplifyapp.com/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\":Rqjttt9ura:-form-item\"]")).sendKeys("usman.ahmed@kodexolabs.com");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[2]/form/button")).click();
		//email 
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("usman.ahmed@kodexolabs.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Usman@786");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		Thread.sleep(9000);
		
		//spam 
		driver.findElement(By.xpath("//*[@id=\":as\"]")).click();
		driver.findElement(By.xpath("//*[@id=\":b7\"]/div")).click();
		Thread.sleep(6000);
		
        //loader button 
		driver.findElement(By.xpath("//*[@id=\":4\"]/div[2]/div[2]/div[1]/div/div/div[6]/div")).click();
		
		//email 
		driver.findElement(By.xpath("//*[@id=\":ck\"]/span")).click();
//		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement loginButton2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Your Login Link For Response BPO')]")));
//		loginButton2.click();
		Thread.sleep(2000);	
		
		Thread.sleep(3000);
		
		//looks safe 
		//driver.findElement(By.xpath("//*[@id=\":gh\"]/div[2]/div/div[1]/div/button")).click(); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Looks safe')]")));
		loginButton.click();

		//inbox 
		driver.findElement(By.xpath("//*[@id=\":az\"]/div/div[2]")).click();
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement email = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'Your Login Link For Response BPO')]")));

		// Re-fetch the element to avoid stale reference
		email = driver.findElement(By.xpath("//span[contains(text(), 'Your Login Link For Response BPO')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", email);


//		// Wait for the button to be clickable
//		WebElement loginButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log In Now")));
//		loginButton1.click();
		
		email = driver.findElement(By.xpath("//span[contains(text(), 'Log In Now')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", email);
		
		Thread.sleep(8000);
//
//		// Retrieve the href attribute each time to ensure it's the correct URL
//		String loginUrl = loginButton1.getAttribute("href");
//
//		// Click the button to simulate the normal action (login or whatever it triggers)
//		loginButton1.click();
//
//		// After the click, open the login URL in a new tab
//		((JavascriptExecutor) driver).executeScript("window.open(arguments[1], '_blank');", loginUrl);
//
//		Thread.sleep(5000); 
//    	
		driver.findElement(By.xpath("//*[@id=\"campaign-management-sidebar-link\"]")).click();
		
       
	  //driver.quit();
    
    }}