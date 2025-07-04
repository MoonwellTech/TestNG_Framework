package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohana Priya T\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		Actions a = new Actions(driver);
		Robot r = new Robot();

		WebElement bestSeller = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
		WebElement sell = driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_sell_T3\"]"));
		WebElement mobile = driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_mobiles\"]"));


	}
}
