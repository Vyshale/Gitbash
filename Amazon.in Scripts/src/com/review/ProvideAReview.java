package com.review;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProvideAReview {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/Campus-Flash-Running-Shoes-7-LS-201/dp/B07D91MYFP/ref=sr_1_1_sspa?crid=LXJJ3EXPSQTG&dib=eyJ2IjoiMSJ9.mCoj6l_PCCD8hUamnqPavyEEJnzcNXd2j48DxylkHjkNyitXZtkFGcdf84PYFmFhFUDB4oR5-lE9ae4-1eG7STvy1vOX7-4l1ksm5w5BTdHTnwFp8UCESBvHaRGr6ICOLwBCVem4HWXCh-Bpn2JdJd_nmBYvTXqKAymPyl77jxYnXLOlxPzEqiFYdd2Lbq_Lqld8GBUKjpByb9uqwEWLNmp17M40bY7nhMFX-Tk8y9OPOXaihjsUEoi1Mbz805B7iBH3UbF1bXaI2b8mxhZTtzON_gt-EIcS7Z05Y9Rbs30.J8jaeQFc-MyKAzWhi9m7MhZq8ojbIYOuZGEN-fanwEA&dib_tag=se&keywords=shoes&qid=1724049877&sprefix=%2Caps%2C325&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		WebElement reviewFrame=	driver.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]"));
		WebElement review=	driver.findElement(By.xpath("(//span[@class='reviewCountTextLinkedHistogram noUnderline'])[1]"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(review);
		driver.switchTo().frame(reviewFrame);
		Thread.sleep(3000);
		review.click();
		driver.findElement(By.xpath("//a[@id='a-autoid-37-announce']")).click();
		driver.quit();


	}

}
