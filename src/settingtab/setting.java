package settingtab;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setting {

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
    	
        //Personal Profile
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[1]/button[1]")).click();
    	Thread.sleep(5000);
    	
    	//User Name
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
    	 WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div[2]/input")));
         username.clear();
         username.sendKeys("usmanahmed");
         Thread.sleep(3000);
    	
         //add user
         driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/form/input")).sendKeys("usmanahmed1234@kodexolabs.com");
         //add user button 
         driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/form/button/img")).click();
         
//         //change password
//         driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/div[3]/p[1]/span")).click();
//         Thread.sleep(10000);
////         
////         //change password modal 
//         WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(200));
//    	 WebElement password = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div/div/div[1]/div/div[2]/input")));
//         password.clear();
//         password.sendKeys("Test12345");
//         Thread.sleep(20000);	
////         
////         //New password
//         Thread.sleep(10000);
//         driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[2]/div/div[2]/input")).sendKeys("Test12345");
////         WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
////    	 WebElement newpassword = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div/div/div[2]/div/div[2]/input")));
//         //newpassword.clear();
////         newpassword.sendKeys("Test12345");
//         
////        // driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[2]/div/div[2]/input")).sendKeys("Test12345");
////         //cat eye
//////         driver.findElement(By.cssSelector("body > div:nth-child(8) > div > div > div > div:nth-child(3) > div > div.border.relative.w-full.rounded-md.border-seaGreen > div > svg")).click();
//////         Thread.sleep(2000);
////         
////         //Re-type Password
////         driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/div/div[2]/input")).sendKeys("Test12345");
////         driver.findElement(By.cssSelector("body > div:nth-child(8) > div > div > div > div:nth-child(5) > div > div.border.relative.w-full.rounded-md.border-seaGreen > div > svg")).click();
////         Thread.sleep(2000);
         
        //notified by email  
         driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/div[5]/div/div[2]")).click();
        
         //input email 
         driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/div[5]/div/div[2]/input")).sendKeys("usman@gmail.com");
         driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/div[5]/div/div[2]/div/img")).click();
         Thread.sleep(3000);
         
         //save changes button 
         driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/div[7]/button")).click();
         Thread.sleep(2000);
         
         //delete account 
         driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/div[3]/p[2]")).click();
         
         //input filed
//         WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(200));
//    	 WebElement password = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/div/div/div[1]/div/div[2]/input")));
//         password.sendKeys("Test12345");
//         Thread.sleep(20000);	
//      
         
         WebElement iframeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div.w-full.relative.flex > div.w-full.overflow-auto.h-\\[100\\%\\].mx-\\[10px\\].pt-\\[23px\\] > div > div > div.bg-lightBlack.p-\\[15px\\].border-TooltipGray.rounded-\\[20px\\].border.md\\:w-\\[72\\%\\] > div > div.flex.mt-\\[35px\\] > p.font-sans.underline.font-medium.text-red.text-\\[18px\\].ml-\\[20px\\].md\\:ml-\\[40px\\].cursor-pointer")));
       
         
         // Input field inside iframe
         WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/div/div/div[1]/div/div[2]/input")));
         password.sendKeys("Test12345");
         Thread.sleep(20000);
         driver.switchTo().defaultContent();
         //driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[1]/div/div[2]/input")).sendKeys("test2647");
         
         //cancel button
         driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div[2]/div")).click();
         Thread.sleep(5000);
         
         
    	driver.quit();				
    }}
		