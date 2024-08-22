package com.ShoppingCart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpdateCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/Campus-Flash-Running-Shoes-7-LS-201/dp/B07D91MYFP/ref=sr_1_1_sspa?crid=3EHXULCAGGF2G&dib=eyJ2IjoiMSJ9.D6X5fpntm3gY23fUAM0XEOgOhQYixnw3V00dCYMQcfw3NCbijZbxoC_8bCZpEmJSFUDB4oR5-lE9ae4-1eG7SXrSBjkjLZajHR_iWBDh1yrAHEg7NidnMThBpwfDVkXzb-l42NUxISuN3X8Pn1M6Snv-l0E0TGE_z88pfbb0ZvZfajzSRQCnOCdybPzzCdBldEewRXIxUN3JptdmERUihyJqXLza2ZRXX09fEUCyeKIVh2t6hzuVE7O9KNhvUfzaGvFNB9x8L6Qp6Ll2WOlfx116tbEEbp3V4hlltrYdrQo.Kd5U40knofL2lPf2fGnOiKg4p4v-NHK3m49MiN_wM4I&dib_tag=se&keywords=shoes&qid=1723782486&sprefix=shoe%2Caps%2C234&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		driver.findElement(By.id("add-to-cart-button")).click();
		Actions builder = new Actions(driver);
		WebElement cart = 	driver.findElement(By.xpath("//a[@id='nav-cart']"));
		builder.click(cart).perform();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.id("quantity_2")).click();
//		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Boolean subtotal =	driver.findElement(By.xpath("//span[@id='sc-subtotal-label-activecart']")).isDisplayed();
		System.out.println(subtotal);
		driver.quit();
	}

}
