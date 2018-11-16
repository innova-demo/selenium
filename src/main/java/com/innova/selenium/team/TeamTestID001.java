package com.innova.selenium.team;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TeamTestID001 {

	public WebDriver driver;

	@Test
	public void openInnovaDemo() {
		driver.get("http://localhost:8080/frontend/");
		driver.findElement(By.xpath("//button[@label='Add']")).click();
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}