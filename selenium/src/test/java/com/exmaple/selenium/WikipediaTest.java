package com.exmaple.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaTest {
	
	private WebDriver driver;
	
	@Before
	public void inicializarDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() {
		String palabraBuscar = "Colombia";
		driver.get("https://es.wikipedia.org");
		WebElement campoBusqueda = driver.findElement(By.id("searchInput"));
		WebElement botonBusqueda = driver.findElement(By.id("searchButton"));
		
		campoBusqueda.sendKeys(palabraBuscar);
		botonBusqueda.click();		
		WebElement titulo = driver.findElement(By.id("firstHeading"));
		
		assertEquals(palabraBuscar, titulo.getText());
		
	}
	
	@After
	public void cerrarDriver() {
		driver.close();
	}
}
