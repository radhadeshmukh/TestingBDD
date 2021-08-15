package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.dropdown;

public class Amazonpage extends dropdown{

	public Amazonpage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static By hellosignin = By.xpath("//*[contains(text(),\"Hello, Sign in\")]");
	public static By Email = By.name("email");
	public static By Submitbutton = By.id("continue");
	public static By password = By.name("password");
	public static By signin = By.id("signInSubmit");
	public static By search = By.xpath("//input[@id=\"twotabsearchtextbox\"]");
	public static By openmenu = By.xpath("//a[@aria-label=\"Open Menu\"]");
}
