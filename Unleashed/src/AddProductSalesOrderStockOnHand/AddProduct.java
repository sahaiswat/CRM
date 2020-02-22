package AddProductSalesOrderStockOnHand;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddProduct {
	
	
			public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssinha\\Desktop\\driver\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://au.unleashedsoftware.com/v2/");
		   driver.findElement(By.id("username")).sendKeys("qa+sinha@unl.sh");
			driver.findElement(By.id("password")).sendKeys("P@ssword123");
			driver.findElement(By.id("btnLogOn")).click();
			String s = RandomStringUtils.randomAlphanumeric(8);
			driver.findElement(By.xpath("//span[contains(@class, 'ng-binding') and contains(text(),'Inventory')][1] ")).click();
			driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS) ;
			driver.findElement(By.xpath("//span[contains(@class, 'ng-binding') and contains(text(),'Products')][1] ")).click();
			driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS) ;
			driver.findElement(By.xpath("//span[contains(@class, 'ng-binding') and contains(text(),'Add Product')] ")).click();
			driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS) ;
			driver.findElement(By.id("Product_ProductCode")).sendKeys(s);
			driver.findElement(By.id("Product_ProductDescription")).sendKeys(s);
			driver.findElement(By.id("btnSave")).click();
				
}
}