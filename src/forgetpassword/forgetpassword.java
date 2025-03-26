package forgetpassword;



import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class forgetpassword {
	public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\USER\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
		driver.get("https://chatbot-admin.kodexolabs.ai/login");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[1]/div/div[2]/input")).sendKeys("usman.ahmed@kodexolabs.com");
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[3]/div/div[2]/input")).sendKeys("Test12345");
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[4]/button/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/a/p")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[1]/div/div[2]/input")).sendKeys("usman.ahmed@kodexolabs.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[2]/button/div")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/a/div/button/div")).click();
			driver.get("https://mail.google.com/mail/u/0/?ogbl#inbox");
			driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("usman.ahmed@kodexolabs.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(5000);
		
	   driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Usman@786");
	   driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
	   
	  //spam folder
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\":kd\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\":ks\"]/div")).click();
	   Thread.sleep(3000);
	   
	// Locate all emails in the spam folder
       List<WebElement> emails = driver.findElements(By.cssSelector("#\\:pf"));

       if (emails.size() > 0) {
           // Click the first email (assuming it's the latest)
           emails.get(0).click();

           // Wait for the email to open
           Thread.sleep(3000);

           // Extract the email body text
           WebElement emailBody = driver.findElement(By.xpath("xpath_of_email_body"));
           String emailText = emailBody.getText();

           // Regex to find OTP (assuming it's a 6-digit number)
           Pattern otpPattern = Pattern.compile("\\b\\d{6}\\b");
           Matcher matcher = otpPattern.matcher(emailText);

           if (matcher.find()) {
               String otpCode = matcher.group();
               System.out.println("Extracted OTP Code: " + otpCode);
           } else {
               System.out.println("OTP code not found in the email.");
           }

       } else {
           System.out.println("No emails found in the spam folder.");
       }

	   driver.findElement(By.cssSelector(("#\\:pf"))).click();
	   
		
		//driver.quit();
}}



    