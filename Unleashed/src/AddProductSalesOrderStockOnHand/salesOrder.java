package AddProductSalesOrderStockOnHand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class salesOrder {

	
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
					
			driver.findElement(By.xpath("//span[contains(@class, 'ng-binding') and contains(text(),'Sales')][1] ")).click();
			
			WebElement orders =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='ng-binding'][contains(.,'Orders')])[2] ")));
			orders.click();
								
			WebElement addsalesorder= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@ng-href='/v2/SalesOrder/Update'][contains(.,'Add Sales Order')])[2] ")));
			addsalesorder.click();
			
			WebElement customercode= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@id,'CustomerSearchButton')]")));
			customercode.click();
			
			WebElement customersearch=wait.until(ExpectedConditions.elementToBeClickable(By.id("CustomerSearchCode")));
			customersearch.sendKeys("PTEC");
			WebElement findcustomer= wait.until(ExpectedConditions.elementToBeClickable(By.id("RunCustomerSearch")));
			findcustomer.click();
			
			WebElement result= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#'][contains(.,'PTECH')]")));
			result.click();
					
			WebElement tab=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ProductAddLine")));
			tab.click();
			
			WebElement ProductSearch=wait.until(ExpectedConditions.elementToBeClickable(By.id("ProductSearchButton")));
			ProductSearch.click();
			
			WebElement LocalProductSearch=wait.until(ExpectedConditions.elementToBeClickable(By.id("LocalProductSearch")));
			LocalProductSearch.sendKeys("DINING");
			
			WebElement RunProductLocalSearch=wait.until(ExpectedConditions.elementToBeClickable(By.id("RunProductLocalSearch")));
			RunProductLocalSearch.click();
			
			WebElement result1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'DININGCHAIR')]")));
			result1.click();
			
			WebElement quantity= wait.until(ExpectedConditions.elementToBeClickable(By.id("QtyAddLine")));
			quantity.sendKeys("1");
			
			WebElement btnAddOrderLine=wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAddOrderLine")));
			btnAddOrderLine.click();
			
			WebElement btnComplete=wait.until(ExpectedConditions.elementToBeClickable(By.id("btnComplete")));
			btnComplete.click();
			
			WebElement completeorder1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='generic-confirm-modal-yes']")));
			
			Actions actions = new Actions(driver);
			actions.moveToElement(completeorder1).click().build().perform();
			
}
}