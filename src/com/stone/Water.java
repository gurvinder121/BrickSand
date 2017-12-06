package com.stone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Water {

public static void main(String [] args) {
    WebDriver driver;
	
	
	System.setProperty("webdriver.gecko.driver","./Material/geckodriver.exe");
	driver=new FirefoxDriver();
    driver.get("https://mail.google.com");
   	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("amarpreetsingh121");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("househou1");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	driver.close();
	
}
}