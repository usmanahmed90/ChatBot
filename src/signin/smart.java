package signin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class smart {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\USER\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.app.smarthistory.ai/signin");
        driver.manage().window().maximize();
        Thread.sleep(500);

        // Sign in
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("teamuser@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test12345");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/form/div[4]/button")).click();
        Thread.sleep(15000);
//        
        // Schedule Interview 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[1]/button")).click();
        
        // Interviewee Name 
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/input")).sendKeys("Usman");
        
        // Interviewee Email
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/input")).sendKeys("usman.ahmed@kodexolabs.com");
        
        // Interview Type (Custom Dropdown)
        WebElement dropdownElement = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/input"));
        dropdownElement.click();  // Open the dropdown

        // Select the desired option by finding it in the dropdown and clicking it
        WebElement desiredOption = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/input"));
        desiredOption.click();
        
        // Language 
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[4]/div[2]/div/div[1]/div[2]")).click();
        
        //Download file 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[5]/div/div[1]")).click();
        Thread.sleep(5000);
        
        //Search bar 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/header/nav/div/div/div/input")).sendKeys("usman");
        Thread.sleep(5000);
              
        // Subscription
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div/a")).click();
        Thread.sleep(200);
        
        // Account
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div/button")).click();
        Thread.sleep(200);
        
        driver.quit();
    }
}
   