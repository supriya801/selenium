package selenium;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class StaticTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		/*//Entering value in name field
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Testing");
		//selecting gender radio button
		driver.findElement(By.xpath("//input[@id='male']")).click();
		
		//selecting specific country from dropdown
		WebElement drpcontryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpcontry = new Select (drpcontryEle);
		drpcontry.selectByVisibleText("France");
		//selecting color
		WebElement color = driver.findElement(By.xpath("//select[@id='colors']"));
		Select colors = new Select(color);
		colors.selectByIndex(2);
		//opens the link
		driver.findElement(By.xpath("//a[text()='orange HRM']")).click();
		
		//navigate back to home page
		  driver.navigate().back();
		//select multiple checkboxs(last 3 checkboxes)
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		for(int i=4;i<checkbox.size();i++)
				{
					checkbox.get(i).click();
				}*/
		
		/*String mainHandle = driver.getWindowHandle();
		//to open the link in new window tab
		WebElement orange = driver.findElement(By.xpath("//a[text()='orange HRM']"));
		//orange.click();
		String keyString =   Keys.CONTROL+Keys.SHIFT.toString()+Keys.ENTER.toString();
		orange.sendKeys(keyString);
		Thread.sleep(5000);
		driver.switchTo().window(mainHandle);*/
		//static table to get data with specific entry(ex: author mukesh)
		List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int rows = row.size();
		
		for(int r=2;r<rows;r++) {
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			//System.out.println(author);
			if (author.equals("Mukesh")) {
		        String bookdata = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
		        System.out.println(bookdata+"\t"+author);
		}
		}
	}

}
