package groomx;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snippet {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\USER\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
		driver.get("https://develop.d1an0qk6p52jat.amplifyapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//login 
		driver.findElement(By.xpath("//*[@id=\":r0:-form-item\"]")).sendKeys("usman1@kodexo.com");
		driver.findElement(By.xpath("//*[@id=\":r1:-form-item\"]")).sendKeys("Test1234@");
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/form/button")).click();
		Thread.sleep(6000);
		
		//sidebar opener
		driver.findElement(By.xpath("/html/body/div/div/main/main/header/div/button")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Client Management')]")));
//		loginButton.click();
		Thread.sleep(9000);
		
		//Client Management
		driver.findElement(By.linkText("Client Management")).click();
		Thread.sleep(2000);
		
		//search bar 
		driver.findElement(By.xpath("/html/body/div/div/main/main/div/div/div/div/div/div[1]/div/input")).sendKeys("owen");
        Thread.sleep(3000);		
        
		//add client 
		driver.findElement(By.xpath("/html/body/div[1]/div/main/main/div/div/div/div/div/div[1]/button")).click();
		
		//client name 
		driver.findElement(By.xpath("//*[@id=\":r4:-form-item\"]")).sendKeys("Usman");
		
		



    }
  }
