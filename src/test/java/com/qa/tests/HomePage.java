package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\QA\\Way2Automation\\Selenium_prerequisites\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.costco.com/");
		
		/*WebElement link=driver.findElement(By.id("warehouse-savings"));
		link.click();*/
		
		//WebElement dnAll=driver.findElement(By.id("warehouse-savings"));
		/*Select dropdown = new Select(driver.findElement(By.id("warehouse-savings")));
		dropdown.selectByVisibleText("Grocery");
		
		driver.findElement(By.id("search-field")).sendKeys("milk");*/
		
		driver.findElement(By.linkText("View Warehouse Savings")).click();
		
		Actions action = new Actions(driver);
		
		WebElement element=driver.findElement(By.id("Home_Ancillary_0"));
		
		action.moveToElement(element).click().perform();
		
		
	

	}
}
