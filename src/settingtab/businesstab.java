package settingtab;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class businesstab {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open the URL and maximize the window
        driver.get("https://chatbot-admin.kodexolabs.ai/login");
        driver.manage().window().maximize();

        // Enter username and password
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[1]/div/div[2]/input"))
              .sendKeys("usman.ahmed@kodexolabs.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[3]/div/div[2]/input"))
              .sendKeys("Test12345");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/form/div[4]/button/div"))
              .click();

        // Wait for the page to load fully
        Thread.sleep(30000);

        // Scroll to and click the "Settings" tab
        WebElement settingsTab = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div[2]/a[6]/span"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", settingsTab);
        js.executeScript("arguments[0].click();", settingsTab);

        // Click the "Business" tab
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[1]/button[2]")).click();

        // Update business name
        WebElement username = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/form/div[1]/div[1]/div/div[2]/input"));
        username.clear();
        username.sendKeys("usmanahmed");

//        // Update business email
//        WebElement email = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/form/div[2]/div[1]/div/div[2]/input"));
//        email.clear();
//        email.sendKeys("hello@gmail.us");
//        
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/form/div[2]/div[2]/div/div[2]/div")).click();
//        Actions actions = new Actions(driver);
//		// Navigate through the dropdown options using the keyboard
//		// Example: Down arrow key and Enter key(jaha locators naa ho waha iss trah kr
//		// sktai hai aur agr second opt select krna huwa tou arrow down wali command
//		// wapis daini praigi)
//		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(300);
//		actions.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(4000);
////		driver.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[2]")).click();
//		Thread.sleep(8000);
//		 WebElement phonenumber = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/input"));
//	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		 phonenumber.clear();
//	     Thread.sleep(300);
//         phonenumber.sendKeys("0198739293739");
//		Thread.sleep(4000);
		
	
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/form/div[10]/div/div[2]/input")).sendKeys("usman.ahmed@kodexola.com");
		driver.findElement(By.cssSelector("#root > div.w-full.relative.flex > div.w-full.overflow-auto.h-\\[100\\%\\].mx-\\[10px\\].pt-\\[23px\\].md\\:ml-\\[240px\\] > div > div > div.bg-lightBlack.p-\\[15px\\].border-TooltipGray.rounded-\\[20px\\].border.md\\:w-\\[72\\%\\].md\\:h-\\[86vh\\] > div > form > div.w-full.md\\:w-\\[50\\%\\].sm\\:w-\\[60\\%\\] > div > div.mt-1.relative.rounded-md.bg-transparent.border-seaGreen.text-base.items-center.placeholder\\:text-slate-600.text-white.border.py-2.px-2.ring-inset.font-sans.font-medium > div > img"));
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div/form/div[11]/button/p")).click();
		Thread.sleep(5000);
		
		//Refresh The Page 
		 
		 driver.navigate().refresh();
		
		 
//		//  Click the "Business" tab
	   // driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[1]/button[2]")).click();
	        Thread.sleep(8000); 
        driver.quit();
       
    }}

