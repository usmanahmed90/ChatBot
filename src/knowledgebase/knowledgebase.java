package knowledgebase;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class knowledgebase {public static void main(String[] args) throws InterruptedException  {
    // Set the path to the chromedriver executable
    System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\USER\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");

    // Initialize WebDriver
    WebDriver driver = new ChromeDriver();
	driver.get("https://chatbot-admin.kodexolabs.ai/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[1]/div/div[2]/input")).sendKeys("usman.ahmed@kodexolabs.com");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[3]/div/div[2]/input")).sendKeys("Test12345");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[4]/button/div")).click();
	//Thread.sleep(15000);
	
	//knowledge Base Tab 
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
	WebElement newsource = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div[2]/a[4]")));
	newsource.click();
	
	//Add New Source
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[1]/a/div")).click();
	
//	//File Browrse Button
	
    	WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[2]/div/input"));
     	uploadButton.sendKeys("C:\\Users\\USER\\Desktop\\Chat Bot\\about page.pdf");
    	Thread.sleep(5000);
     	//Start Uploading
////	
////	 driver.findElement(By.cssSelector("#root > div.w-full.relative.flex > div.w-full.overflow-auto.h-\\[100\\%\\].mx-\\[10px\\].pt-\\[23px\\].md\\:ml-\\[240px\\] > div > div.bg-lightBlack.p-\\[15px\\].border-TooltipGray.rounded-\\[20px\\].border.undefined > div.md\\:px-\\[18px\\].my-\\[10px\\] > button > p")).click();
////	 Thread.sleep(5000);
//	 
	 //Links Tab
	 
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[1]/div/div[2]")).click();
	 
	 //URL Input Field
	 
	 WebElement button= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[2]/form/input"));
	 button.sendKeys("https://gold.pk/gold-rates-karachi-khi.php");
	 Thread.sleep(5000);
	 
	 //Start Uploading Button URL 
	 
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[2]/form/button")).click();
	 Thread.sleep(5000);
	 
	 //Text Tab 
	 
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[1]/div/div[3]")).click();
	 
	 //Text Input Field
	 
	 WebElement Text= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[2]/form/div/textarea"));
	 Text.sendKeys("Saindak Copper Gold Project is located near Saindak town in Chagai District of Balochistan, Pakistan. The discovery of gold, copper & silver deposits at Saindak was made in the 1970s in collaboration with ahe Saindak Copper-Gold Project was set up by Saindak Metals Ltd.");
	 
	 //Start Uploading Button 
	 
//	 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/div[2]/form/button")).click();
//	 Thread.sleep(5000);
//	 
	 //Refresh The Page 
	 
	 driver.navigate().refresh();
	 
	 //Back Button 
	 
	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(200));
	 WebElement backbutton = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[1]/a/img")));
	 backbutton.click();
	 
	 Thread.sleep(8000);
	 
	 driver.quit();
	 
}}