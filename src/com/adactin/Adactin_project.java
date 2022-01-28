package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_project {
	
	public static void main(String[] args) {
			
System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://adactinhotelapp.com/index.php");

WebElement id = driver.findElement(By.id("username"));

id.sendKeys("lokesh123");
		

WebElement pass = driver.findElement(By.id("password"));

pass.sendKeys("123456789");

WebElement login = driver.findElement(By.id("login"));
login.click();

WebElement loca = driver.findElement(By.id("location"));

Select s = new Select(loca);

s.selectByValue("New York");

WebElement hotel = driver.findElement(By.id("hotels"));
Select s1 = new Select(hotel);
s1.selectByValue("Hotel Creek");

WebElement rooms = driver.findElement(By.id("room_type"));
Select s2 = new Select(rooms);
s2.selectByValue("Super Deluxe");


WebElement nos = driver.findElement(By.id("room_nos"));
Select s3 = new Select(nos);
s3.selectByValue("2");

WebElement indate = driver.findElement(By.id("datepick_in"));
 indate.sendKeys("27/01/2022");

 WebElement outdate = driver.findElement(By.id("datepick_out"));
 outdate.sendKeys("30/01/2022");

 
 WebElement adult = driver.findElement(By.id("adult_room"));
 Select s4 = new Select(adult);
 s4.selectByValue("2");

 WebElement child = driver.findElement(By.id("child_room"));
 Select s5 = new Select(child);
 s5.selectByValue("3");
 
 WebElement serch = driver.findElement(By.id("Submit"));
 serch.click();
 
 WebElement radio = driver.findElement(By.id("radiobutton_0"));
 
 radio.click();
 
 WebElement continu = driver.findElement(By.id("continue"));
 continu.click();
 
 
 WebElement fname = driver.findElement(By.id("first_name"));
 fname.sendKeys("lokesh");
 
 WebElement lname = driver.findElement(By.id("last_name"));
 lname.sendKeys("loki");
 
 WebElement address = driver.findElement(By.id("address"));
 address.sendKeys("7G/Rainbow Colany , Dubai mainrode__Dubai-600091");
 
 WebElement card = driver.findElement(By.id("cc_num"));
 card.sendKeys("1234567890123456");
 
 
 WebElement ctype = driver.findElement(By.id("cc_type"));
 Select s6 = new Select(ctype);
 s6.selectByValue("AMEX");
 
 WebElement emonth = driver.findElement(By.id("cc_exp_month"));
 Select s7 = new Select(emonth);
 s7.selectByValue("11");
 
 
 WebElement eyear = driver.findElement(By.id("cc_exp_year"));
 Select s8 = new Select(eyear);
 s8.selectByValue("2022");
 
 WebElement cvv = driver.findElement(By.id("cc_cvv"));
 cvv.sendKeys("123");
 
 WebElement book = driver.findElement(By.id("book_now"));
 book.click();
 
WebElement logout = driver.findElement(By.xpath("(//input[@class='reg_button'])[3]"));
 
logout.click();

	}
	

}
