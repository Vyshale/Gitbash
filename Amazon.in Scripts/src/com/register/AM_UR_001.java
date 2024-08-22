package com.register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AM_UR_001 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Start here.")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Vyshale");
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9895458774");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Vyshu@1927");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.quit();

		//Actions builder = new Actions(driver);



	}

}
