
package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ragupathi\\Desktop\\Selinium\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.get("https://www.google.com/");
	WebElement elem=wb.findElement(By.id("lst-ib"));
	elem.click();
	elem.clear();
	elem.sendKeys("hello");
		elem.submit();
		System.out.println(wb.getTitle());
		wb.close();
		
	}

}
