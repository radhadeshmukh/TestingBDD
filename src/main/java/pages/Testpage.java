package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.dropdown;

public class Testpage extends dropdown {
	
	public Testpage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public By industry = By.xpath("//select[@id=\"Form_submitForm_Industry\"]");
	 public static By Country = By.id("Form_submitForm_Country");
	 public static By Email = By.xpath("//input[@type=\"email\"]");
	 public static By search = By.xpath("//input[@type=\"search\"]");
	 public static By result = By.xpath("//h4[@class=\"product-name\"]");
}
