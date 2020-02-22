package AddProductSalesOrderStockOnHand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stockonhand {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssinha\\Desktop\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver,100);
		driver.manage().window().maximize();
		   driver.get("https://au.unleashedsoftware.com/v2/");
		   driver.findElement(By.id("username")).sendKeys("qa+sinha@unl.sh");
			driver.findElement(By.id("password")).sendKeys("P@ssword123");
			driver.findElement(By.id("btnLogOn")).click();
			
			WebElement reports =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Reports')]")));
			reports.click();
			WebElement inventory =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='ng-binding'][contains(.,'Inventory')])[2]")));
			inventory.click();
			WebElement stockonhand =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ng-binding'][contains(.,'Stock On Hand Enquiry')]")));
			stockonhand.click();
			WebElement productcode =wait.until(ExpectedConditions.elementToBeClickable(By.id("ProductCode")));
			productcode.click();
			WebElement productcodesearch =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@id,'btnProductCodeSearch')]")));
			productcodesearch.click();
			WebElement productsearch =wait.until(ExpectedConditions.elementToBeClickable(By.id("LocalProductSearch")));
			productsearch.sendKeys("CHAIR");
			WebElement searchbutton =wait.until(ExpectedConditions.elementToBeClickable(By.id("RunProductLocalSearch")));
			searchbutton.click();
			WebElement productcode1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href='#'][contains(.,'CHAIR')])[1]")));
			productcode1.click();
			
           WebElement run=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='fm-button grid-overlay-button overlay-link'][contains(.,'Run')]")));
			
			Actions actions = new Actions(driver);
			actions.moveToElement(run).click().build().perform();
					
	}

}
