import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestFacebook {

	public static void main(String[] args) {
		
		
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath(".//*[@id='email']")).clear();
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("tanjia");
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys("12345");
        driver.findElement(By.id("u_0_n")).click();
        
        
        

	}

}
