package com.ShoppingCart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AM_SC_021 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/81tBck28XyL._AC_UL320_.jpg']"))
		.click();
		
		
		Thread.sleep(4000);
		WebElement cartButton = driver.findElement(By.id("submit.add-to-cart"));
		
		Actions builder = new Actions(driver);
		
		builder.doubleClick(cartButton).perform();
		
		
		driver.quit();
	}

}
