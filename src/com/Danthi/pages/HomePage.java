package com.Danthi.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Danthi.Constants.Constants;

public class HomePage {
public static void main()
		{
			Constants cst=new Constants();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://danthi.in");
			driver.getTitle();
			List<WebElement>lst=driver.findElements(By.linkText("Home"));
		}
}
